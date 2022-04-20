public class Factorial {  
    
  public static void main(String[] args) {   
      System.out.println("factorial loop");
      factorial();
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