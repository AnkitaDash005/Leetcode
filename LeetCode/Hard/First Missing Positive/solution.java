class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[(nums.length-1)];
        if(max<=0){
            return 1;
        }
        for( int i=1;i<max;i++){
            if(i>0){
            int index = Arrays.binarySearch(nums,i);
            if(index>=0){
                continue;
            }
            return i;
        }
        }
       
        return max+1;
    }
}