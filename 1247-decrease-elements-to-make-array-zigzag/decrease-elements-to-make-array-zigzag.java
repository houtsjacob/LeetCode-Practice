class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int[] deepCopy = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) deepCopy[i] = nums[i];
        
        int even = evenIndexed(nums);
        int odd = oddIndexed(deepCopy);
        
        System.out.println(even + ", " + odd);
        
        return Math.min(even, odd);
    }
    
    private int evenIndexed(int[] nums) {
        int moves = 0;
        
        for(int i = 0; i < nums.length; i = i + 2) {
            int left = i - 1;
            int right = i + 1;
            
            if(left >= 0) {
                if(nums[left] >= nums[i]) {
                    moves += nums[left] - nums[i] + 1;
                    nums[left] = nums[i] - 1;
                }
            }
            
            if(right < nums.length) {
                if(nums[right] >= nums[i]) {
                    moves += nums[right] - nums[i] + 1;
                    nums[right] = nums[i] - 1;
                }
            }
        }
        
        return moves;
    }
    
    private int oddIndexed(int[] nums) {
        int moves = 0;
        
        for(int i = 1; i < nums.length; i = i + 2) {
            int left = i - 1;
            int right = i + 1;
            
            if(left >= 0) {
                if(nums[left] >= nums[i]) {
                    moves += nums[left] - nums[i] + 1;
                    nums[left] = nums[i] - 1;
                }
            }
            
            if(right < nums.length) {
                if(nums[right] >= nums[i]) {
                    moves += nums[right] - nums[i] + 1;
                    nums[right] = nums[i] - 1;
                }
            }
        }
        
        return moves;
    }
}