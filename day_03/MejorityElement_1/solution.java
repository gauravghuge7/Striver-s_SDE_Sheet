import java.util.HashMap;
import java.util.Hashtable;

class demoSolution {

   public int majorityElement(int[] nums) {
   
      int n = nums.length;
      
      int midSize = n / 2;

      int count = 0; 

      HashMap<Integer, Integer> freq = new HashMap<>();
      for(int i=0; i<n; i++) {



         if(freq.containsKey(nums[i])) {

            int fq = freq.get(nums[i]);

            freq.put(nums[i], fq + 1);

         }
         else {
            freq.put(nums[i], 1);
         }
      }

      return 0;
      
   }
}