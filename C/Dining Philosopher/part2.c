#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h> 
#include <time.h>

pthread_mutex_t *chopsticks;
int num_philosophers;

void pickUpChopsticks(int threadIndex);
void eating(int threadIndex);
void putDownChopsticks(int threadIndex);
void creatPhilosophers(int nthreads);
void *philosopherThread(void* pVoid);

int main(int argc, char *argv[]) {
	if (argc < 2) {
		printf("usage: %s <nthreads>\n", argv[0]);
		return 1;
	}

	int nthreads = atoi(argv[1]);
	num_philosophers = nthreads;

	srandom(time(NULL));

	printf("Christian Burek Assignment 4: # of threads = %d\n", nthreads);

	creatPhilosophers(nthreads);

	return 0;
}

void creatPhilosophers(int nthreads) {
	pthread_t threads[nthreads];
	chopsticks = malloc(sizeof(pthread_mutex_t) * nthreads);
	int i;

	for (i = 0; i < nthreads; i++) {
		pthread_mutex_init(&chopsticks[i], NULL);
	}
	
	for (i = 0; i < nthreads; i++) {
		int* arg = malloc(sizeof(int));
		*arg = i;
		pthread_create(&threads[i], NULL, philosopherThread, arg);
	}

	for (i = 0; i < nthreads; i++) {
		pthread_join(threads[i], NULL);
	}

	printf("%d threads have been completed/joined successfully!\n", nthreads);

	for (i = 0; i < nthreads; i++) {
		pthread_mutex_destroy(&chopsticks[i]);
	}
	free(chopsticks);
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

	pthread_mutex_lock(&chopsticks[left]);
	pthread_mutex_lock(&chopsticks[right]);	
}

void putDownChopsticks(int id) {
	int left = id;
	int right = (id + 1) % num_philosophers;

	pthread_mutex_unlock(&chopsticks[left]);
	pthread_mutex_unlock(&chopsticks[right]);
}

void* philosopherThread(void* pVoid) {
	int id = *(int*)pVoid;
	free(pVoid);

	thinking(id);
	pickUpChopsticks(id);
	eating(id);
	putDownChopsticks(id);	

	return NULL; }
