import java.util.Hashtable;

class Solution {
   public int majorityElement(int[] nums) {
   
      int n = nums.length;
      
      int midSize = n / 2;

      int count = 0; 

      Hashtable<Integer, Integer> freq = new HashTable<>();
      for(int i=0; i<n; i++) {

        

         if(freq.containsKey(nums[i])) {

            int fq = freq.get(nums[i]);

            freq.add(nums[i], fq + 1);

         }
         else {
            freq.add(nums[i], 1);
         }
      }

      if(freq.containsValue() > midSize) {
         
      }
   
   }
}