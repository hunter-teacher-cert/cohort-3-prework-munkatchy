import java.util.Scanner;

public class Celcius{

  public static void main(String[] args) {
    //define the variables and constants
    double tempinC;
    double tempinF;
    final double C_TO_F_CONVERSION = 1.8;
    Scanner in = new Scanner(System.in);

    //prompt the user for a Celcius temp with one decimal place
    System.out.print("What is the temp today in Celcius? ");
    tempinC = in.nextDouble();

    //convert and output
    tempinF = (tempinC * C_TO_F_CONVERSION) + 32;
    System.out.printf("%.1f C = %.1f F\n", tempinC, tempinF);


  }
}