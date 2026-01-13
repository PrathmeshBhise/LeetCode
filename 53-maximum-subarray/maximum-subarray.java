class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int max=nums[0];
        int i=0;

        while(i<nums.length){
            csum=Math.max(nums[i],csum+nums[i]);
            max=Math.max(csum,max);
            i++;
        }
        return max;
    }
}