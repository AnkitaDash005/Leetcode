class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]==target){
                return left;
            }
            else if(nums[right]==target){
                return right;
            }
            right--;
            left++;
        }
        return -1;
        
    }
}