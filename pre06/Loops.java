public class Loops{
  
  public static void main(String[] args) {
    System.out.println("Square root approximation");
    squareRoot(24.0);
    System.out.println();
    System.out.println("x to the n power table");
    example();
    System.out.println();
    System.out.println("factorial loop");
    factorial();
  }
  
  public static void squareRoot(double num) {
    double temp;
    double guess=num/2;
    do
      {
        temp=guess;
        guess=(temp+(num/temp))/2;
      }
      while((temp-guess)> .0001);
      System.out.println(guess);

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
    
  public static void factorial(){
      int fact = 1;  
      int i = 1;
      int num = 5;
      
      while( i <= num ){
            fact = fact * i;   
            i++;   
        }      
      System.out.println("Factorial of " + num + " is: " + fact);  
    }  
  
}