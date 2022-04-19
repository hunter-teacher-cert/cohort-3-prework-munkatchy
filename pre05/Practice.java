public class Practice {

  public static void main(String[] args) {
    System.out.println("distance");
    System.out.println(distance(1.0, 2.0, 4.0, 6.0));
    }

    public static double distance
            (double xc, double yc, double xp, double yp) {
        double dx = xp - xc;
        double dy = yp - yc;
        double dsquared = dx * dx + dy * dy;
        double radius = Math.sqrt(dsquared);
        System.out.println("dx is " + dx);
        System.out.println("dy is " + dy);
        System.out.println("dsquared is " + dsquared);
              return radius;
      }

    public static double circleArea
            (double xc, double yc, double xp, double yp) {
              double radius = distance(xc, yc, xp, yp);
              double area = calculateArea(radius);
              return area;
            }

     public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }
}