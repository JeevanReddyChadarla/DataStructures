class Solution {
    public int firstUniqChar(String a) {
    HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		int start=0, end=a.length()-1, i=0;
		while(start<=end) {
			map.put(a.charAt(start), map.getOrDefault(a.charAt(start), 0)+1);
			start++;
		}
		while(i<=end) {
			if(map.get(a.charAt(i))==1) {
				return i;
			}
			i++;
		}
		return -1;
    }
}