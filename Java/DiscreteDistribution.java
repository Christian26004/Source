public class DiscreteDistribution {

  public static void main(String[] args) {

    int m;
    int t; // temp vaiable to put args[n] into array
    int[] a = new int[args.length - 1];

    try {
      m = Integer.parseInt(args[0]);
      for (int n = 1; n < args.length; n++) {
        t = Integer.parseInt(args[n]);
        a[n - 1] = t;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutofBoundsException, either too many or not enough input conditions.\njava DiscreteDistribution <m> <a[0]> <a[1]> ... <a[n]>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException, all numbers must be valid intergers.\njava DiscreteDistribution <m> <a[0]> <a[1]> ... <a[n]>");
      return;
    }

    System.out.println(a.length + " " + m);
  }

}
