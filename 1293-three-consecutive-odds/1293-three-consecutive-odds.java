class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int start=0, end=arr.length-1, count=0, ans=0;
        while(start<=end){
            if(arr[start]%2==1){
                count++;
            }else{
                count=0;
            }
            ans = Math.max(ans,count);
            start++;
        }
        return ans>=3;
    }
}