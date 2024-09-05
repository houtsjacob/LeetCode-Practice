class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int result = 0;
        
        for(int i = 3; i >= 0; i--) {
            int check = (int) Math.pow(10, i);
            int one, two, three;
            
            one = (num1 >= check) ? (num1 / check) : 0;
            two = (num2 >= check) ? (num2 / check) : 0;
            three = (num3 >= check) ? (num3 / check) : 0;
            
            result += Math.min(one, Math.min(two, three)) * check;
            
            num1 %= check;
            num2 %= check;
            num3 %= check;
        }
        
        return result;
    }
}