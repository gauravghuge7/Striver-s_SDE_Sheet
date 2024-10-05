class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;

        int columnStart = 0;

        int columnEnd = n - 1;


        while(columnStart <= columnEnd) {

            int columnMid = columnStart + (columnEnd - columnStart) / 2;

            int rowStart = 0;
            int rowEnd = matrix[columnMid].length -1;

            boolean flag = false;
            
            while(rowStart <= rowEnd) {
                
                int rowMid = rowStart + (rowEnd - rowStart) / 2;

                if(matrix[columnMid][rowMid] == target) return true;

                else if(matrix[columnMid][rowMid]  < target) {
                    rowStart = rowMid + 1;
                }
                else {
                    rowEnd = rowMid - 1;
                }

            }

            if(flag == false && matrix[columnMid][0] < target) {
                columnStart = columnMid + 1;
            }
            else {
                columnEnd = columnMid - 1;
            }

            
        }


        
        return false;
    }
}