class Solution {
    public int addDigits(int num) {

        while(num>9){
            int k=num;
            int t=0;
            while(k>0){
                t+=k%10;
                k/=10;
            }
            num=t;

        }
        return num;
    }
}