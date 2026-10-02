public class BandMatrix {

  public static void main(String[] args) {
    
    int n;
    int width;

    // Takes in two integer numbers 'n' and 'width'.
    try {
      n = Integer.parseInt(args[0]);
      width = Integer.parseInt(args[1]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: The input must include two valid integer numbers.\nUsage: java BandMtaric <n> <width>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("Error: There must be two valid integer numbers.");
      return;
    }
    
    // loops to create an n-by-n grid
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {

        if (Math.abs(i-j) >= width + 1) {
          System.out.print("0  ");
        } else {
          System.out.print("*  ");
        }

      }
       
      System.out.print("\n");
    }
  }
}
