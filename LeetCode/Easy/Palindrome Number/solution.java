class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int s=x;
        int f=0;
        while(x>0){
            f*=10;
            f+=(x%10);
            x=x/10;
        }
        if(s==f){
            return true;
        }
        return false;
    }
}