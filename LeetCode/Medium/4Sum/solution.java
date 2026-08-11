import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                long sum = (long) target - nums[i] - nums[j];
                int th=j+1;
                int fo=nums.length-1;
                while(th<fo){
                   
                    if(nums[th]+nums[fo]==sum){
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[th]);
                        quad.add(nums[fo]);
                        list.add(quad);
                        th++;
                        fo--;
                        while(th < fo && nums[th] == nums[th-1]) th++;
                        while(th < fo && nums[fo] == nums[fo+1]) fo--;

                    }
                    else if (nums[th] + nums[fo] < sum) {
                        th++;
                    }
                    else {
                        fo--;
                    }
                }
        }
        }
        return list;
    }
}