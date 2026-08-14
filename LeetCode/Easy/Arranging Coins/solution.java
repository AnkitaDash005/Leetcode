class Solution {
    public int arrangeCoins(int n) {
        int k=1;
        int c=0;
        while(n>0){
            n=n-k;
            if(n<0){
                break;
            }
            c++;
            k++;
        }
        return c;
    }
}