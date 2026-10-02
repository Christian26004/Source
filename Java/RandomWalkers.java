public class RandomWalkers {

  public static void main(String[] args) {

    int r = 0;
    int trials = 0;

    try {
      r = Integer.parseInt(args[0]);
      trials = Integer.parseInt(args[1]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: This program requires two valid INTEGER inputs!\nUsage: java RandomWalker <r> <trials>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("Error: This program requires two valid INTEGER inputs!");
      return;
    }

    int x;
    int y;
    int steps = 0;
    double rand = 0;
    
    for (int i = 1; i <= trials; i++) {
      x = 0;
      y = 0;
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
        steps++;
      }
    }

    double averageSteps = (double) steps / (double) trials;
    System.out.println("average number of steps = " + averageSteps);
  }
}
