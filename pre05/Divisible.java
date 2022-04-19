public class Divisible {

  public static void main(String[] args) {
    System.out.println("Are these integers divisible?");
    System.out.println(isDivisible(25, 5));

    }
  
  public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }

    }
}