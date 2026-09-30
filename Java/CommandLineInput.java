class CommandLineInput {

  public static void main(String[] args) {

    // Take the input of 2 integers from the command line
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    // Compute the mathematical operations 
    int sum = a + b;
    int sub = a - b;
    int mult = a * b;
    int div = a / b;
    int mod = a % b;

    // Print out the sums of all the equations
    System.out.println(a + " + " + b + " = " + sum);
    System.out.println(a + " - " + b + " = " + sub);
    System.out.println(a + " * " + b + " = " + mult);
    System.out.println(a + " / " + b + " = " + div);
    System.out.println(a + " % " + b + " = " + mod);

  }

}
