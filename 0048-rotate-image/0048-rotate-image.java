class Solution {
    public void rotate(int[][] matrix) {
        

        int n = matrix.length ;
        int m = matrix[0].length; 

        for(int row = 0; row<n; row++){
            for(int col = row+1; col<m; col++){
                int temp = matrix[row][col];
                matrix[row][col]= matrix[col][row];
                matrix[col][row] = temp ; 
            }
        }

        //reverse array 

        for (int row = 0 ; row<n; row++){
            int start = 0;
            int end = n-1; 
            while (start<=end){
                int temp = matrix[row][start];
                matrix[row][start]=matrix[row][end];
                matrix[row][end]= temp;
                start++;
                end--;

            }
        }
        
    

    }
}