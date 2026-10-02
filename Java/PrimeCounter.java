public class PrimeCounter {

  public static void main(String[] args) {
    
    int n;
    int t = 0;
    int primeCounter = 0;

    // take an input number and return exceptions based on command-line input
    try {
      n = Integer.parseInt(args[0]); 
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("There must be a command-line variable representing a vaild integer number.");
      return;
    } catch (NumberFormatException e) {
      System.out.println("The input must be a vaild integer number.");
      return;
    } 

    // Determines the number of primes smaller than n
    for (int currentNumber = 2; currentNumber < n; currentNumber++) {
      boolean isPrime = true;

      for (int j = 2; j * j<= currentNumber; j++) {

        if (currentNumber % j == 0) {
          isPrime = false;
          break;
        }

      }

      if (isPrime == true) {
        primeCounter++;
      }
    }

    System.out.println("Number of prime less than " + n + " is " + primeCounter + "." );
  }
}
