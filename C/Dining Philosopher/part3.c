#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h> 

pthread_mutex_t lock;
pthread_cond_t can_eat;
int nextIndex = 0;
int num_philosophers;

void thinking(int id);
void eating(int id);
void pickUpChopsticks(int id);
void putDownChopsticks(int id);
void creatPhilosophers(int nthreads);
void* philosopherThread(void* pVoid);

int main(int argc, char *argv[]) {
	if (argc < 2) {
		printf("usage: %s <nthreads>\n", argv[0]);
		return 1;
	}

	int nthreads = atoi(argv[1]);
	num_philosophers = nthreads;

	srandom(42);

	printf("Christian Burek Assignment 4: # of threads = %d\n", nthreads);

	pthread_mutex_init(&lock, NULL);
	pthread_cond_init(&can_eat, NULL);

	creatPhilosophers(nthreads);

	pthread_mutex_destroy(&lock);
	pthread_cond_destroy(&can_eat);

	return 0;
}

void creatPhilosophers(int nthreads) {
	pthread_t threads[nthreads];
	int i;

	for (i = 0; i < nthreads; i++) {
		int* arg = malloc(sizeof(int));
		*arg = i;
		pthread_create(&threads[i], NULL, philosopherThread, arg);
	}

	for (i = 0; i < nthreads; i++) {
		pthread_join(threads[i], NULL);
	}

	printf("%d threads have been completed/joined successfully!\n", nthreads);
}

void thinking(int id) {
	int sleepTime = (random() % 500) + 1;
	printf("Philosophers #%d: starts thinking\n", id);
	usleep(sleepTime * 1000);
	printf("Philosophers #%d: ends thinking\n", id);
}

void eating(int id) {
	int sleepTime = (random() % 500) + 1;
	printf("Philosophers #%d: starts eating\n", id);
	usleep(sleepTime * 1000);
	printf("Philosophers #%d: ends eating\n", id);
}

void pickUpChopsticks(int id) {
	int left = id;
	int right = (id + 1) % num_philosophers;

	while (nextIndex != id) {
		pthread_cond_wait(&can_eat, &lock);
	}
}

void putDownChopsticks(int id) {
	nextIndex++;
	pthread_cond_broadcast(&can_eat);
	pthread_mutex_unlock(&lock);
}

void* philosopherThread(void* pVoid) {
	int id = *(int*)pVoid;
	free(pVoid);

	thinking(id);
	pickUpChopsticks(id);
	eating(id);
	putDownChopsticks(id);	

	return NULL;
}
