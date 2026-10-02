public class RandomWalker {

  public static void main(String[] args) {

    int r = 0;

    try {
      r = Integer.parseInt(args[0]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: This program requires a valid INTEGER input!\nUsage: java RandomWalker <r>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("Error: This program requires a valid INTEGER input!");
    }

    int x = 0;
    int y = 0;
    int steps = 0;
    double rand = 0;
    
    System.out.println("(0, 0)");
    while ((Math.abs(x) + Math.abs(y)) != r) {
      rand = Math.random();
      if (rand < 0.25) {
        x++;
      } else if (rand < 0.50) {
        x--;
      } else if (rand < 0.75) {
        y++;
      } else {
        y--;
      }
      System.out.println("(" + x + ", " + y + ")");
      steps++;
    }
    System.out.println("steps = " + steps);
  }
}
