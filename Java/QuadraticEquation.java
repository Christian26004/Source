class QuadraticEquation {

  public static void main(String[] args) {
    
    // Takes in two command line inputs
    double b = Double.parseDouble(args[0]);
    double c = Double.parseDouble(args[1]);

    // Calculates the total both + and - of the quadratic equation
    double discriminate = ( b * b ) - ( 4.0 * c );
    double d = Math.sqrt(discriminate);
    double root1 = ( -b + d ) / 2.0;
    double root2 = ( -b - d ) / 2.0;

    // Prints the output to the command line.
    System.out.println(" + " + root1);
    System.out.println(" - " + root2);
  }
}
