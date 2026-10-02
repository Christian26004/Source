public class GamblersRuin {
  
  // Takes in 4 or 5 command-line inputs
  // option: 1 = bet method and 2 = problem method
  // stake: How much money is on the line 
  // bet: How much you want to spend per trial 
  // goal: What is the goal you are trying to reach
  // (if option = 2) trials: Number of times you want the game to run
  public static void main(String[] args) {
    
    int option = Integer.parseInt(args[0]);
    int stake = Integer.parseInt(args[1]);
    int bet = Integer.parseInt(args[2]);
    int goal = Integer.parseInt(args[3]);
    
    if (option == 1) {
      bet(stake, bet, goal);
    }
    else if (option == 2) {
      int trials = Integer.parseInt(args[4]);
      problem(stake, bet, goal, trials);
    }   
  }
  
  // Takes stake, bet, and goal and runs the game once
  private static int game(int stake, int bet, int goal){
    while (stake > 0 && stake < goal) {

      if (Math.random() < .45) stake += bet; // house needs their cut.
      else                    stake -= bet;
      
    }
    return stake;
  }
  
  // Runs game once and returns if it was a lose or win
  private static void bet(int stake, int bet, int goal) {
    
    stake = game(stake, bet, goal);

    if (stake >= goal) System.out.println("You win!");
    else               System.out.println("You lost.");
  }

  // Runs the game trial number of times and prints number of times over tial times
  private static void problem(int stake, int bet, int goal, int trials) {
    int wins = 0;
    int cash = stake;
    for (int t = 0; t < trials; t++) {

      cash = game(stake, bet, goal);

      if (cash >= goal) wins++;
    }
    System.out.println(wins + " wins of " + trials);
  }
}
