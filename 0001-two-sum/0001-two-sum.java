class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[] = new int[2];
        int start=0, end=arr.length-1, sum=0;
        HashMap<Integer, Integer>map = new HashMap<>();
        while(start<=end){
            if(map.containsKey(target-arr[start])){
                ans[0]=start;
                ans[1]=map.get(target-arr[start]);
                return ans;
            }
            map.put(arr[start], start);
            start++;
        }
    return ans;
}
}