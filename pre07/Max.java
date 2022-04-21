import java.util.Arrays;
// yes an enhanced loop can be used see Maxe.java
public class Max {

  public static void main(String[] args) {
    int[] numbers = {72,35,100,3,8,6};
    System.out.println(Arrays.toString(numbers));
    System.out.println(indexOfMax(numbers));
    
  }
  
  public static int indexOfMax(int[] numbers){
      int index = 0;
      for (int i=1;i<numbers.length;i++){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }

}
