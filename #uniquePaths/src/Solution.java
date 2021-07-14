import java.util.*;
// find the number of unique paths that exist from the top left of a grid 
// to the bottom right. Can only move right or down
class Solution {
    public int uniquePaths(int m, int n) {
		// creating a 2D array
        int[][] grid = new int[m][n];
		// fill 1's in the first row
        Arrays.fill(grid[0], 1);
		// fill 1's in the first column
        for (int i = 0; i < m; i ++) {
            grid[i][0] = 1;
        }
		// go through all other positions in the array making sure to update as you go through
        for (int row = 1; row < m; row ++) {
            for (int col = 1; col < n; col ++) {
                grid[row][col] = grid[row - 1][col] + grid[row][col - 1];//can only move left and right 
            }
        }
		// return grid[m-1][n-1] which is the # of path to reach the destination
        return grid[m-1][n-1];
    }
}