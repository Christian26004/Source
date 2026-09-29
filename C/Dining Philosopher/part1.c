#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

// function prototypes
void creatPhilosophers(int nthreads);
void* philosophersThread(void* pVoid);

int main(int argc, char *argv[]) {
	int nthreads;
  
  // checks proper required argument
	if (argc < 2) {
		printf("Usage: %s <nthreads>\n", argv[0]);
		return 1;
	}
  
  // converts string argument to int
	nthreads = atoi(argv[1]);
  
	printf("Christian Burek Assignment 4: # of threads = %d\n", nthreads);

  // calls creatPhilosopher with number of threads
	creatPhilosophers(nthreads);

	return 0;
}

// called by the if function in creatPhilosophers
// tells the program which index number they are and prints the 
// philosophers index and frees the philosopher afterwards
void* philosophersThread(void* pVoid) {
	int index = *(int*)pVoid;
	printf("This is a philosopher %d\n", index);

	free(pVoid);
	return NULL;
}

// creates new threads
void creatPhilosophers(int nthreads) {
	// stores threads in an array 
  pthread_t threads[nthreads];
	int i;
  
  // loop that creates philosopher threads
  // runs for number of nthreads
	for (i = 0; i < nthreads; i++) {
    // creates memory in heap to prevent race condition
		int* arg = malloc(sizeof(int));
		*arg = i;

    // Creates the thread, check for error
		if (pthread_create(&threads[i], NULL, philosophersThread, arg)) {
			perror("Failed to create thread");
		}
	}

  // makes sure all threads have been completed
	for (i = 0; i < nthreads; i++) {
		pthread_join(threads[i], NULL);
	}
  
	printf("%d threads have been completed/joined successfully!\n", nthreads);
}
