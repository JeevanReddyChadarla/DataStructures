class Solution {
    public void rotate(int[] nums, int k) {
        int start=0, end=nums.length;
        int arr[]=nums.clone();
        while(start<end){
            nums[(k+start)%end] = arr[start];
            start++;
        }
    }
}