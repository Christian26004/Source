public class TwoDRandomWalk {

	public static void main(String[] args) {
	  
    int n = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    int steps = 0;
    
    while (2 * n != x && 2 * n != y) {
      
      double rand = Math.random();

      if (rand <= .25) {
        x++; // right
      } else if (rand >= .25 && rand <= .50) {
        x--; // left 
      } else if (rand >= .50 && rand <= .75) {
        y++; // up
      } else if (rand >= .75 && rand <= 1.0) {
        y--; // down
      }

      steps++; 
      
    }

    System.out.println("It took you " + steps + " steps to reach the boundary.");
	}
}
