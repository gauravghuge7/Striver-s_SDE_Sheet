class solutionMejority {
    
    private void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i=left, j = mid + 1, k=0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            nums[i] = temp[k];
        }

    }




    public int mergeSort(int[] nums, int left, int right) {

        if(left >= right) {
            return 0;
        }

        int mid = left + (right - left ) / 2;

        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

        int j = mid + 1;

        for(int i=left; i <= mid; i++) {

            while( j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            count += (j - (mid + 1));
        }


        // merge the array 
        merge(nums, left, mid, right);

        return count;
    }



    public int reversePairs(int[] nums) {
        

        int n = nums.length;

        if (nums == null || n < 2) {
            return 0;
        }

        // Optimized Code


        return mergeSort(nums, 0, n-1);



       // Brute Force Approach 

       // int count = 0;

       // int max = Integer.MAX_VALUE;
       // int min = Integer.MIN_VALUE;

       // for(int i=0; i<n; i++) {

       //     int start = i + 1;
       //     int end = n-1;


       //     while(start <= end) {

       //         if((long) nums[i] > 2L * nums[start]) count++;

       //         if((long) nums[i] > 2L * nums[end] && start != end) count++;


       //         start++;
       //         end--;    


       //     }
           
       // } 

       // return count;
   }


    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6,7,8,9};

        solutionMejority solution = new solutionMejority();

        System.out.println(solution.reversePairs(nums));   
    }
}