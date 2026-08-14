class Solution {
    public boolean checkRecord(String s) {
        int l = 0;
        int a = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) != 'L') {
                l = 0;
            } else {
                l++;
                if (l == 3) {
                    return false;
                }
            }
            
        
            if (s.charAt(i) == 'A') {
                a++;
                if (a >= 2) {
                    return false;
                }
            }
        }
        
        return true;
    }
}