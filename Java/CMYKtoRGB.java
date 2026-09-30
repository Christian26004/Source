class CMYKtoRGB {

  public static void main(String[] args) {

    double C = Double.parseDouble(args[0]); // Cyan
    double M = Double.parseDouble(args[1]); // Magenta
    double Y = Double.parseDouble(args[2]); // Yellow
    double K = Double.parseDouble(args[3]); // Black

    double white = 1 - K;
    double red = 255 * white * (1 - C);
    double green = 255 * white * (1 - M);
    double blue = 255 * white * (1 - Y);

    System.out.println("Red: " + (int) red);
    System.out.println("Green " + (int) green);
    System.out.println("Blue " + (int) blue);

  }
}
