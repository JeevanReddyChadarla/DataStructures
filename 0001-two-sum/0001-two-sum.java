class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[] = new int[2];
		int start=0, end=arr.length-1;
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		while(start<=end) {
			if(map.containsKey(target-arr[start])) {
				ans[0]=start;
				ans[1]=map.get(target-arr[start]);
				System.out.println(Arrays.toString(ans));
				return ans;
			}
			map.put(arr[start],start);
			start++;
		}
		System.out.println(Arrays.toString(ans));
		return ans;
    }
}