package day_09_Recursion.subsetSum;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.IOException;


class Solution {

   public void calculate(ArrayList<Integer> ans, ArrayList<Integer> arr, int index) {

      if(arr.size() == index) return;
      
      int subSum = 0;
      
      for(int i=index; i<ans.size(); i++) {
         
         subSum += arr.get(i);
         
      }
      
      ans.add(subSum);
      
      calculate(ans, arr, index+1);
   }
   

   
   ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
       // code here
      
      ArrayList<Integer> ans = new ArrayList<>();
      
      ans.add(0);
      
      if(n == 0) return ans;
      
      
      for(int i=0; i<arr.size(); i++) {
         
         ans.add(arr.get(i));
         
      }
   
      calculate(ans, arr, 0);
      
      
      return ans;
      
   }
}






class subset {

   public static void main(String args[]) throws IOException {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int N = sc.nextInt();
         ArrayList<Integer> arr = new ArrayList<>();
         for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
         }
         Solution ob = new Solution();

         ArrayList<Integer> ans = ob.subsetSums(arr, N);
         Collections.sort(ans);
         for (int sum : ans) {
            System.out.print(sum + " ");
         }
         System.out.println();
      }


      sc.close();
   }
}