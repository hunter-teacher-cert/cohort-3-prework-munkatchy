public class Triangle {

  public static void main(String[] args) {
    System.out.println("Do these sides make a triangle?");
    System.out.println(isTriangle(12, 7, 8));

    }
  
  public static boolean isTriangle(int x, int y, int z) {
        if (x > (y + z) || y > (x +z) || z > (x + y)) {
            return false;
        } else {
            return true;
        }

    }
}