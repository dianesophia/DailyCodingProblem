//Hard
import java.util.*;

public class Problem2{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      System.out.println();
      int[] num = new int[size];
    
      for(int i = 0; i < size; i++){
         System.out.print("Enter number: ");
         num[i] = sc.nextInt();  
      }
      
      int[] ans = new int[size];
      
      for(int i = 0; i < size; i++){
         int temp = 1;
         for(int j = 0; j < size; j++) {
            if(j != i)
               temp *= num[j];
         }
         ans[i] = temp;
      }
      
      System.out.println();
      System.out.print("Answer = { ");
      for(int i = 0; i < size; i++) {
         System.out.print(ans[i]);
         if(i < size - 1) {
            System.out.print(", ");
         }
      }
      System.out.print(" }");
   }
}
