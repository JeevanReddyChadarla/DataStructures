class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, i=0, j=k, ans=Integer.MIN_VALUE;
        for(int p=0;p<k;p++){
            sum+=nums[p];
        }
        ans = sum;
        while(j<nums.length){
            sum -= nums[i];
            i++;
            sum += nums[j];
            j++;
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
        return (double)ans/k;
    }
}