class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        
        int i = num.length() - 1;
        boolean fixed = false;
        
        if (num.charAt(i) != '0') return num;
        
        while(i >= 0) {
            if(num.charAt(i) == '0' && !fixed) {
                i--;
                continue;
            }
            else {
                fixed = true;
                sb.append(num.charAt(i));
                i--;
            }
        }
        
        return sb.reverse().toString();
    }
}