class RightTriangle {

  public static void main(String args[]) {
  
    // Takes 3 command-line args
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    // Ensures that max equal to c 
    int min = Math.min(Math.min(a, b), c);
    int max = Math.max(Math.max(a, b), c);
    int mid = (a + b + c) - (min + max);

    // a^2 + b^2 = c^2
    int left = (min * min) + (mid * mid);
    int right = (max * max);
    boolean rightTriangle = left == right;

    System.out.println(rightTriangle);
  }
}
