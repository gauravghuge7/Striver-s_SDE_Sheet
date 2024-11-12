
package day_01_Array_1.pascal_tringle;

import java.util.ArrayList;
import java.util.List;



/* 
 *  
 * Problem Statement: Given numRows, print the first numRows of Pascal's Triangle.
 * 
 * Sample Input: 
 *    numRows = 5
 * 
 * Sample Output: 
 *    1
 *    1 1
 *    1 2 1
 *    1 3 3 1
 *    1 4 6 4 1
 * 
 *       Example 1:

      Input: numRows = 5
      Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
      Example 2:

      Input: numRows = 1
      Output: [[1]]
      

      Constraints:

      1 <= numRows <= 30



      LeetCode Link: https://leetcode.com/problems/pascals-triangle/description/

      118. Pascal's Triangle
   
      Given an integer numRows, return the first numRows of Pascal's triangle.

      In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:












 * 
*/



class demoPascal {

   public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> ans = new ArrayList<>();

      for(int i=0; i<numRows; i++) {
         List<Integer> temp = new ArrayList<>();
         
         temp.add(1);
         
         for(int j=1; j<i; j++) {
            int val = ans.get(i-1).get(j-1) + ans.get(i - 1).get(j);
            temp.add(val);
         }

         if(i > 0) {
            temp.add(1);
         }

         ans.add(temp);
      }

      return ans;
   }

}


class pascal {
   public static void printTriangle(List<List<Integer>> list) {
      for(int i=0; i<list.size(); i++) {
         for(int j=0; j<list.get(i).size(); j++) {  // Changed 'i' to 'j' in the loop condition and index
            System.out.print(list.get(i).get(j)+" ");  // Changed 'i' to 'j' in get() method
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      demoPascal object1 = new demoPascal();
      List<List<Integer>> list = object1.generate(8);
      
      printTriangle(list);
   }
}