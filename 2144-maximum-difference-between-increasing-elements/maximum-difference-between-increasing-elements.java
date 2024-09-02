class Solution {
    public int maximumDifference(int[] nums) {
        int result = -1;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                if(diff == 0) continue;
                result = Math.max(diff, result);
            }
        }
        
        return result;
    }
}