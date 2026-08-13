class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int left=1;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]>nums[right]){
                min=Math.min(nums[right],min);
            }
            else{
                min=Math.min(nums[left],min);
            }
            left++;
            right--;
        }
        return min;
    }
}