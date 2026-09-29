import java.util.Scanner;

class InputOutput {

  public static void main(String[] args) {

  System.out.println("Input your name :");
  
  // Scans the users name upon request.
  Scanner scanner = new Scanner(System.in);
  String name = scanner.nextLine();

  System.out.println("Hello, " + name);

  }

}
