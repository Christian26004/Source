public class deck {

  public static void main(String[] args) {
  String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
  String[] face = {" of Diamonds", " of Clubs", " of Hearts", " of Spades"};
  String[] deck = new String[52];

  for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 13; j++) {
      deck[j + i*13] = number[j] + face[i];
      
      System.out.println(deck[j + i*13]);
    }
  }
  } 
}
