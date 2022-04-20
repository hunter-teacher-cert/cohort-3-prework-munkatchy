public class Power {

  public static void main(String[] args) {
        System.out.println("x to the n power");
        example();
    }
    
    public static void example() {
        int i = 1;
        while (i < 10) {
            double x = i;
            int n = i;
            System.out.println(x + "   " + Math.pow(x,n));
            i = i + 1;
        }
    }
}