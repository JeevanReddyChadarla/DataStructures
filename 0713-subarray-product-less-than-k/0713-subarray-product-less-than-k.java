class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int start=0, i=0, end=arr.length-1;
        if(k<=1){
            return 0;
        }
        int count=0, prod=1;
        while(start<=end){
            prod = prod*arr[start];
            while(prod>=k){
                prod=prod/arr[i];
                i++;
            }
            count=count+(start-i+1);
            start++;
        }
        return count;
    }
}