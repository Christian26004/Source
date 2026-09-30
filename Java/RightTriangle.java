public  class RightTriangle {

  public static void main(String[] args) {
  
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
    boolean rightTriangle = left == right && min != 0 && mid != 0 && max != 0;
    
    // ensures all numbers are positive
    int absMin = Math.abs(min);
    int absMid = Math.abs(mid);
    int absMax = Math.abs(max);
    absMin = min + absMin;
    absMid = mid + absMid;
    absMax = max + absMax;
    rightTriangle = rightTriangle && absMin != 0 && absMid != 0 && absMax != 0;

    System.out.println(rightTriangle);
  }
}
