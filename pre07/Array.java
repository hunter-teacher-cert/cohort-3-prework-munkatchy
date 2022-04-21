import java.util.Arrays;
//8.1
public class Array {

  public static void main(String[] args) {
    double [] a = {1.0,2.0,3.0,4.0};
    powArray(a,2);
    }
  
  public static double[] powArray(double[] a, int n){
      
  double[] array = new double[a.length];
      
  for (int i=0;i<a.length;i++){
         array[i] = Math.pow(a[i],n);
      }
      
  return array;
   }
}
//8.2
public class Array {

  public static void main(String[] args) {
    int [] a = {1,2,3,4};
    histogram(a,20);
    }
  
  public static int[] histogram(int[] a, int count){
      int[] counter = new int[count];
      for (int element:a){
         counter[element]++;
      }
      return counter;
   }
}