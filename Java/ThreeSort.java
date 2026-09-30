public class ThreeSort {

  public static void main(String[] args) {
    
    // Command-line integers
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    
    // Find the min mid and max
    int min = Math.min(Math.min(a, b), c);
    int max = Math.max(Math.max(a, b), c);
    int mid = (a + b + c) - (min + max);

    // Print to command-line
    System.out.println(min + " " + mid + " " + " " + max);
  }
}
