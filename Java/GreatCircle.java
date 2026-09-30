class GreatCircle {

  public static void main(String[] args) {

    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);
    double r = 6_371.0; // mean radius of the Earth (kilometers)
    
    // converts degrees to radians
    x1 = Math.toRadians(x1);
    x2 = Math.toRadians(x2);
    y1 = Math.toRadians(y1);
    y2 = Math.toRadians(y2);

    double sin1 = Math.sin((x2 - x1)/2);
    double sinSquared1 = sin1 * sin1;
    double cos1 = Math.cos(x1);
    double cos2 = Math.cos(x2);
    double sin2 = Math.sin((y2 - y1)/2);
    double sinSquared2 = sin2 * sin2;

    double squareRoot = Math.sqrt(sinSquared1 + cos1 * cos2 * sinSquared2);
    double distance = ( 2 * r ) * Math.asin(squareRoot);

    System.out.println(distance + " kilometers");
  }
}
