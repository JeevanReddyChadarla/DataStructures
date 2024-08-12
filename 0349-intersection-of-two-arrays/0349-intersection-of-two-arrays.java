class Solution {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer>set = new HashSet<Integer>();
		HashSet<Integer>ans = new HashSet<Integer>();
		int start=0, end=a.length-1, i=0, j=b.length-1, p=0;
		while(start<=end) {
			set.add(a[start]);
			start++;
		}
		while(i<=j) {
			if(set.contains(b[i])) {
				ans.add(b[i]);
			}
			i++;
		}
		return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}