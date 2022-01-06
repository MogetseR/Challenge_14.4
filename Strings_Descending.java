import java.util.*;

public class Strings_Descending {
   public static void main(String [] args){
      // Descending order
      String[] numbers = {"1","4","3","2","3","7","5","6","9"};
      
      
      System.out.println("before sorting: " + Arrays.toString(numbers));
      
      Arrays.sort(numbers, 0, numbers.length, Collections.reverseOrder());
     
     System.out.println("after sorting: " + Arrays.toString(numbers));
     
     
     }
     }
    
