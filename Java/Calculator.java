import java.util.Scanner;

class Calculator {

  public static void main(String[] args) {

    int a;
    int b;
    char operation;
    Scanner scanner = new Scanner(System.in);

    // Asks user for input a integer.
    System.out.print("\nInput a number: ");
    a = scanner.nextInt();
      
    // Asks user for input b integer.
    System.out.print("\nInput another number: ");
    b = scanner.nextInt();
     
    // Asks user for operation character.
    System.out.print("\nInput a mathematical operation +, -, *, or /: ");
    operation = scanner.next().charAt(0);

    // Checks if user input proper operation.
    if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
      System.out.print("\nMust be a mathematical oepration +, -, *, or /.");
    }
      
    // Decides what operation to use.
    switch (operation) {
      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      case '/':
        System.out.println(a / b);
        break;
      default:
        System.out.println("\nCouldn't calculate.");
        break;
    }
  }
}
