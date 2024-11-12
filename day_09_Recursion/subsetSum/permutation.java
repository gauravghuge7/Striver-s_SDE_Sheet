
package day_09_Recursion.subsetSum;


import java.util.ArrayList;

public class permutation {

   

   public static void print_Permutation_Recursive(ArrayList<Integer> ans) {

      try {
         
      } 
      catch (Exception e) {
         // TODO: handle exception
         
         System.out.println(e);
      }

   }






   public static void print_Permutation_Iterative(ArrayList<Integer> ans) {

      int n = ans.size();

      for(int i=0; i<n; i++) {

         for(int j=0; j<n; j++) {

            System.out.println(ans.get(j));

         }
      }
   }

   public static void main(String[] args) {
   
      ArrayList<Integer> ans = new ArrayList<>();
      
      ans.add(1);
      ans.add(2);
      ans.add(1);

      System.out.println(ans);
      System.out.println();

      print_Permutation_Iterative(ans);

   }
}
