class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int current = Math.abs(nums[i]);
            if(current < closest) {
                closest = current;
                result = nums[i];
            } 
            else if(current == closest) {
                result = Math.max(result, nums[i]);
            }
        }
        
        return result;
    }
}