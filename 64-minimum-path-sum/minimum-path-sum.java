class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return shortestPath(grid, 0, 0, dp);
    }
    
    private int shortestPath(int[][] grid, int x, int y, int[][] dp) {
        // if we step out of bounds
        if(x >= grid.length || y >= grid[0].length) return Integer.MAX_VALUE;
        
        // if we step to the end square
        if(x == grid.length - 1 && y == grid[0].length - 1) return grid[x][y];
        
        // if we already calculated the shortest path return
        if(dp[x][y] != -1) {
            return dp[x][y];
        }
        
        int downStep = shortestPath(grid, x + 1, y, dp);
        int rightStep = shortestPath(grid, x, y + 1, dp);
        
        return dp[x][y] = grid[x][y] + Math.min(downStep, rightStep);
    }
}