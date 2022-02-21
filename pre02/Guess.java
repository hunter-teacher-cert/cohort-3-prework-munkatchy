import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Guess{

  public static void main(String[] args) {
    //pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;

    //define the variables
    int guess;
    int difference;
    int absdif;
    Scanner in = new Scanner(System.in);

    //prompt the user for a guess
    System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is? ");
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.println("Your guess is: " + guess);
    System.out.println("The number I was thinking of is: " + number);

    //difference calc, take the absolute and statement back to user
    difference = number - guess;
    absdif = Math.abs(difference);
    System.out.println("You were off by: " + absdif);
    
    


  }
}