public class Time{

  public static void main(String[] args){
      
      System.out.println("Hello");
      System.out.println("How many seconds has it been since midnight?");

      int hour = 18;
      int minute = 22;
      int second = 10;

      System.out.println("It has been ");
      System.out.println((hour*60*60)+(minute*60)+(second)+(" seconds since midnight"));

      System.out.println("The number of seconds remaining in the day are");
      System.out.println((24*60*60)-((hour*60*60)+(minute*60)+(second)));

      double hourd = 18.0;
      double minuted = 22.0;
      double secondd = 10.0;

      System.out.println("The percentage of the day that has passed is");
      System.out.println(((hourd*3600)+(minuted*60)+(secondd))/(24*3600)*100);

      int hourc = 18;
      int minutec = 49;
      int secondc = 20;

      int timec = (hourc*3600+minutec*60+second);
      int time = (hour*3600+minute*60+second);

      System.out.println("The number of seconds it took me to complete this exercise is");
      System.out.println(timec-time);

      System.out.println("That is");
      System.out.println((timec-time)/60 + " minutes.");
      



  }



}