
package day_08_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
   // Function to find the maximum number of meetings that can
   // be performed in a meeting room.
   public int maxMeetings(int start[], int end[]) {
       // add your code here
      
      
      
      int n = end.length;
      
      
      
      List<Integer> meet[] = new ArrayList[n];
      
      
      for(int i=0; i<n; i++) {
         
         List<Integer> temp = new ArrayList<>();
         
         temp.add(start[i]);
         temp.add(end[i]);
         
         meet[i] = temp;
         
      }
      


   
   
      Arrays.sort(meet, new Comparator<List<Integer>> () {
         
         
         public int compare(List<Integer> a1, List<Integer> a2) {
            return Integer.compare(a1.get(1), a2.get(1));
         }
         
         
      });
   
   
   
   
      int count = 1;
      
      int ansEnd = meet[0].get(1);
      
      
      
      for(int i=1; i<n; i++) {
         
         if(meet[i].get(0) > ansEnd) {
            count++;
            ansEnd = meet[i].get(1);
         }
      }
      
      
      
      
      
      return count;
      
   }
}