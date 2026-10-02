public class GeneralizedHarmonic {

  public static void main(String[] args) {

    int n;
    int r;
    double generalizedHarmonic = 0.0;

    try {
      n = Integer.parseInt(args[0]);
      r = Integer.parseInt(args[1]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: You must include two valid integer numbers.\nUsage: java GeneralizedHarmonic <n> <r>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("Error: The input must be two valid integer numbers.");
      return;
    }
    
    // repeat 1 - n times
    for (int i = 1; i <= n; i++) {
      
      generalizedHarmonic += 1 / (Math.pow(i, r)); 

    }

    System.out.println(generalizedHarmonic);
  }
}
