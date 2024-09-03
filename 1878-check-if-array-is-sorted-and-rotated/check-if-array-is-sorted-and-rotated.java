class Solution {
    public boolean check(int[] nums) {
        boolean drop = false;
        int i = 0;
        
        while(i < nums.length) {
            int j = (i + 1) % nums.length;
            if (nums[i] > nums[j]) {
                if(drop) return false;
                if(!drop) drop = true;
            }
            i++;
        }
        
        return true;
    }
}