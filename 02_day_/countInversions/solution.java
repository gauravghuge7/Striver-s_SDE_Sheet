import java.util.* ;

public class solution {
   public static long getInversions(long arr[], int n) {
      // Write your code here.

      long count = 0;


      for(int i=0; i<arr.length; i++) {

         for(int j = i + 1; j<arr.length; j++) {

            if(i <= n && i < j && j <= n && arr[i] > arr[j]) count++;
         }
      }


      return count;

      
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(getInversions(arr, n));
    }
}