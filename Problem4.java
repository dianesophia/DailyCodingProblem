//hard
import java.util.*;

public class Problem4{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Set<Integer> set = new HashSet<>();
    
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
    
      for(int i = 0; i < size; i++){
         System.out.print("Enter the number: ");
         arr[i] = sc.nextInt();
      }
      
      int smallest = arr[0];
      int largest = arr[0];
    
      for(int i : arr){
         if(i > largest)
            largest = i;
         if(i < smallest)
            smallest = i;
      
         set.add(i);
      }
        
      if(smallest != 0 || smallest != 1)
         smallest = 1;
          
      System.out.print("The first missing number is : "); 
      for(int i = 0, a = smallest; i < size; i++){
         if(!set.contains(a)){
            System.out.print(a);
            System.exit(0);
         }
         a++;
      }
   
      
      System.out.println(largest + 1);
    
   }
}