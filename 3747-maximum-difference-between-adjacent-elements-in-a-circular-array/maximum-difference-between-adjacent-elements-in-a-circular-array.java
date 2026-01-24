class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int diff = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length -1 ;i++){
            int subt = Math.abs(nums[i+1]-nums[i]);
            diff = Math.max(subt, diff);            
        }
        int subt1 = Math.abs(nums[nums.length-1]-nums[0]);
        if(diff <subt1 ){
            return subt1;
        }
        return diff;

        
    }
}