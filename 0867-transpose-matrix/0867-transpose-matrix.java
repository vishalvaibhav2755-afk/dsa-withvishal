class Solution {
    public int[][] transpose(int[][] matrix) {

        int oldrow = matrix.length;
        int oldcol = matrix[0].length;

        int newrow = oldcol;
        int newcol = oldrow;
        int ans [][]= new int [newrow][newcol];

        for(int row = 0; row<oldrow; row++){
            for(int col = 0; col<oldcol; col++){
                ans[col][row]= matrix[row][col];

            }
        }
        return ans;
        
    }
}