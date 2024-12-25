class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int start=0, end=arr.length-1;
        int ans[] = new int[2];
        while(start<=end){
            if(map.containsKey(target-arr[start])){
                ans[0] = start;
                ans[1] = map.get(target-arr[start]);
                break;
            }
            map.put(arr[start], start);
            start++;
        }
    return ans;
    }
}