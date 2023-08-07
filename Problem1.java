import java.util.*;
  //Two sum
  
public class Problem1{
   public static void main(String ...args){
      Scanner sc = new Scanner(System.in);
      Set<Integer> set = new HashSet<>();
      int[] answer = new int[2];
      boolean check = false;
    
      System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      System.out.println();
      int[] num = new int[size];
    
      for(int i = 0; i < size; i++){
         System.out.print("Enter number: ");
         num[i] = sc.nextInt();  
      }
    
      System.out.println();
      System.out.print("Enter the target number: ");
      int target = sc.nextInt();
      System.out.println();    
    
      for(int i = 0; i < size; i++){
         int temp = Math.abs(num[i] - target);
         if(set.contains(temp)){
            answer[0] = num[i];
            answer[1] = temp;
            check = true;
         }
         set.add(num[i]);
      }
    
    
      System.out.print(check? check +  " - " + answer[0] + " + " + answer[1] + " = " + target : check + " ");
   }
}