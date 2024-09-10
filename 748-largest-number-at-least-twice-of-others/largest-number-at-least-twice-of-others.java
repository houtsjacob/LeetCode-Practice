class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int largestIndex = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
                continue;
            }
            
            if(nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        
        if(secondLargest == 0) return largestIndex;
        
        return ((largest / secondLargest) >= 2) ? largestIndex : -1;
    }
}