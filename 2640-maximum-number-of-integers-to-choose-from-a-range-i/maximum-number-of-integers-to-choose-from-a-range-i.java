class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // subproblem 1: get all integers that you can choose
        boolean[] arr = new boolean[n];
        
        for(int i = 0; i < banned.length; i++) {
            if(banned[i] <= n) {
                arr[banned[i] - 1] = true;
            }
        }
        
        // subproblem 2: get the maximum integers that can add up to less than the sum
        int sum = 0;
        int result = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i]) {
                sum += i + 1;
                if(sum > maxSum) break; //sum has exceeded the limit
                ++result;
            }
        }
        
        return result;
    }
}