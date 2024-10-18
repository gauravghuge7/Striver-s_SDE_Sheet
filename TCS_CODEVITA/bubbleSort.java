import java.util.*;

class bubbleSort {

  
  public static int countAscSwaps(int[] arr) {
  
    int n = arr.length;
    int swaps = 0;
    
    int[] copyArr = arr.clone();
    
    for(int i=0; i<n; i++) {
      	boolean flag = false;   // for optimization 
    	for(int j=0; j<n-i-1; j++) {
        	
          if(copyArr[j] > copyArr[j+1]) {
            
            int temp = copyArr[j];
            
            copyArr[j] = copyArr[j+1];
            copyArr[j+1] = temp;
            swaps++;
            flag = true;
          	
          }

        }
      
      	if(flag == false) break;
    }
    
   return swaps;  
  }
  
  public static int countDscSwaps(int[] arr) {
  	
    int n = arr.length;
    int swaps = 0;
    
    int[] copy = arr.clone();
    
    for(int i=0; i<n; i++) {
      
      	boolean flag = false;
    	for(int j=0; j<n-i-1; j++) {
        	
          if(copy[j] < copy[j+1]) {
          	int temp = copy[j];
            copy[j] = copy[j+1];
            copy[j+1] = temp;
            flag = true;
            swaps++;
          }
        }
      
      	if(flag == false) break;
    }
    return swaps;
  }
  
  
  public static void main(String args[]) {
  	
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++) {
    	arr[i] = scan.nextInt();
    }
    
    int ascSwaps = countAscSwaps(arr);
    int dsecSwaps = countDscSwaps(arr);
    
    int minimum = Math.min(ascSwaps, dsecSwaps);
    
    System.out.println(minimum);
	
  	scan.close();
  }
  
}