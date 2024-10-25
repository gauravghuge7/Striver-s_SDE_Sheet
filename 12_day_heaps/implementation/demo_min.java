import java.util.ArrayList;
import java.util.PriorityQueue;

public class demo_min {

   // minHeap function which take size of Queries and Queries as Input.
   // Returns an array out outputs depending on the query.



   static class MinHeap {

         private ArrayList<Integer> heap;

         public MinHeap() {
            heap = new ArrayList<>();
         }

         public void insert(int val) {
            
            heap.add(val);

            heapifyUp(heap.size() - 1);
            
         }

         private void heapifyUp(int index) {
            while (index > 0) {
                  int parentIndex = (index - 1) / 2;
                  if (heap.get(index) >= heap.get(parentIndex)) {
                     break;
                  }
                  swap(index, parentIndex);
                  index = parentIndex;
            }
         }


         public int removeMin() {
            if(heap.size() == 0) {
                  throw new IllegalStateException("heap is empty ");
            }

            int min = heap.get(0);

            int last = heap.remove(heap.size() - 1);

            if(heap.size() > 0) {
                  heap.set(0, last);

                  heapifyDown(0);
            }

            return min;
         }
         private void heapifyDown(int index) {
            int size = heap.size();
            while (index < size) {
                  int leftIndex = 2 * index + 1;
                  int rightIndex = 2 * index + 2;
                  int smallestIndex = index;

                  if (leftIndex < size && heap.get(leftIndex) < heap.get(smallestIndex)) {
                     smallestIndex = leftIndex;
                  }
                  if (rightIndex < size && heap.get(rightIndex) < heap.get(smallestIndex)) {
                     smallestIndex = rightIndex;
                  }
                  if (smallestIndex == index) {
                     break;
                  }
                  swap(index, smallestIndex);
                  index = smallestIndex;
            }
         }

         private void swap(int i, int j) {
            
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
         }

      }




      static int[] minHeap(int n, int[][] q) {
         // Write your code here.
         MinHeap minHeap = new MinHeap();
         ArrayList<Integer> result = new ArrayList<>();

         for (int[] query : q) {
            if (query[0] == 0) {
                  minHeap.insert(query[1]);
            } else if (query[0] == 1) {
                  result.add(minHeap.removeMin());
            }
         }

         // Convert result list to array
         int[] resultArray = new int[result.size()];
         for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
         }
         return resultArray;
   }


   public static void main(String[] args) {
      PriorityQueue pq = new PriorityQueue<>();

      pq.add(7);
      pq.add(8);
      pq.add(10);
      pq.add(3);
      pq.add(90);


   }
}