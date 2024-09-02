class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        char remainder = '0';
        int i = 1;
        while(i <= a.length() && i <= b.length()) {
            char x = a.charAt(a.length() - i);
            char y = b.charAt(b.length() - i);
            
            if(x == '0' && y == '0') {
                result.append(remainder);
                remainder = '0';
            }
            else if(x == '1' && y == '1') {
                result.append(remainder);
                remainder = '1';
            }
            else {
                if(remainder == '1') result.append('0');
                else result.append('1');
            }
            i++;
        }
        
        while(i <= a.length()) {
            char x = a.charAt(a.length() - i);
            if(x == '0') {
                result.append(remainder);
                remainder = '0';
            } 
            else {
                if(remainder == '1') result.append('0');
                else result.append('1');
            }
            i++;
        }
        
        while(i <= b.length()) {
            char x = b.charAt(b.length() - i);
            if(x == '0') {
                result.append(remainder);
                remainder = '0';
            } 
            else {
                if(remainder == '1') result.append('0');
                else result.append('1'); 
            }
            i++;
        }
        
        if(remainder == '1') result.append(remainder);
        
        result.reverse();
        
        return result.toString();
    }
}