
/* 

   Given an integer array nums, find the 
   subarray
   with the largest sum, and return its sum.

   

   Example 1:

   Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
   Output: 6
   Explanation: The subarray [4,-1,2,1] has the largest sum 6.
   Example 2:

   Input: nums = [1]
   Output: 1
   Explanation: The subarray [1] has the largest sum 1.
   Example 3:

   Input: nums = [5,4,-1,7,8]
   Output: 23
   Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
   

   Constraints:

   1 <= nums.length <= 105
   -104 <= nums[i] <= 104
   

   Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.



*/


class array1 {

  // for the brute force approach 
   public int arraySum(int[] nums, int start, int end) {

      int sum = 0;

      
      for(int i= start; i<= end; i++) {

         sum += nums[i];
      }
      System.out.println("sum => "+sum);

      return sum;
   }


   public int maxSubArray(int[] nums) {

   int maxSum = nums[0]; // Initialize maxSum with the first element
   int currentSum = nums[0]; 
   
   
   for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
   }
   
   return maxSum;


 
   // int largeSum = Integer.MIN_VALUE;

   // if(nums.length == 1) return nums[0];

   
   // for(int i=0; i<nums.length; i++) {

   //     for(int j = i; j<nums.length; j++) {

   //         int sum = arraySum(nums, i, j);

   //         largeSum = Math.max(largeSum, sum);
   //     }

   // }

   // return largeSum;


   // int maxSum = Integer.MIN_VALUE;
   // int n = nums.length;

   //  Loop through each subarray
   // for (int i = 0; i < n; i++) {
   //     int currentSum = 0;
   //     for (int j = i; j < n; j++) {
   //         currentSum += nums[j];
   //         maxSum = Math.max(maxSum, currentSum);
   //     }
   // }
   // return maxSum;

   }
}


