import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
       
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]+1>=10){
                digits[i]=digits[i]+1-10;
                i--;
            }
            else{
                digits[i]+=1;
                break;
            }
        }
        if (i < 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
       return digits;
        
    }
}