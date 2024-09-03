class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        
        int currentSum = nums[0];
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[j] <= nums[i]) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum = nums[j];
                i = j;
                j++;
            } else {
                currentSum += nums[j++];
                i++;
            }
        }
        
        return Math.max(currentSum, maxSum);
    }
}