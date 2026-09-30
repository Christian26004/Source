public class RandomInt {
  
  public static void main(String[] args) {
    
    // Takes a command line input muliplies it by a random number between 0 and 1
    // and prints the output.
    int input = Integer.parseInt(args[0]);
    double rand = Math.random();
    int output = (int) (input * rand);

    System.out.println("Random Integer: " + output);
  }
}
