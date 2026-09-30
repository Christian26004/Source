public class CMYKtoRGB {

  public static void main(String[] args) {

    double cyan = Double.parseDouble(args[0]); // C
    double magenta = Double.parseDouble(args[1]); // M
    double yellow = Double.parseDouble(args[2]); // Y
    double black = Double.parseDouble(args[3]); // K

    double white = 1 - black;
    double red = 255 * white * (1 - cyan); // R
    double green = 255 * white * (1 - magenta); // G
    double blue = 255 * white * (1 - yellow); // B
    
    // Ensures the decimal is rounded rather than dropped
    red = Math.round(red);
    green = Math.round(green);
    blue = Math.round(blue);

    System.out.println("Red   = " + (int) red);
    System.out.println("Green = " + (int) green);
    System.out.println("Blue  = " + (int) blue);

  }
}
