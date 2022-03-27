public class Beer {

    public static void main(String[] args) {
        System.out.println("Sing-a-long");
        nLines(4);

      }
      
   public static void nLines(int n) {
        if (n > 0) {
            System.out.println(n+ " bottles of beer on the wall,");
            System.out.println(n+ " bottles of beer,");
            System.out.println("ya take one down, ya' pass it around,");
            System.out.println((n-1)+ " bottles of beer on the wall,");
            System.out.println();
            nLines(n - 1);
        }
      else {
            System.out.println("No, bottles of beer on the wall,");
            System.out.println("No bottles of beer,");
            System.out.println("ya can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
    }
  }
}