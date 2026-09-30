public class UniformRandomNumbers {

  public static void main(String[] args) {

    // Creates 5 uniform random numbers between 0 and 1
    double a = Math.random();
    double b = Math.random();
    double c = Math.random();
    double d = Math.random();
    double e = Math.random();
    
    // Computes the average minimum and maximum
    double average = (a + b + c + d + e) / 5;
    double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    
    // Pritns them to standard output
    System.out.println("average: " + average);
    System.out.println("minimum: " + min);
    System.out.println("maximum: " + max);
  }
}
