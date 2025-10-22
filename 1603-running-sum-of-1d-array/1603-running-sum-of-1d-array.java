class Solution {
    public int[] runningSum(int[] nums) {
        int start=0, end=nums.length-1;
        int sum = 0;
        while(start<=end){
            sum+=nums[start];
            nums[start]=sum;
            start++;
        }
        return nums;
    }
}