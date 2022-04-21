import java.util.Arrays;
//test of Max number with enhanced loop 
public class Maxe {

  public static void main(String[] args) {
    int[] numbers = {72,35,100,3000,8,6};
    System.out.println(Arrays.toString(numbers));
    System.out.println(indexOfMax(numbers));
    
  }
  
 public static int indexOfMax(int[] numbers){
      int index = 0;
      int i = 0;
      for (int number:numbers){
         if (numbers[i] > numbers[index]){
            index = i;
         }
         i++;
      }
      return index;
   }

}
