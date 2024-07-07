class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
       int start=0, end=str.length-1;
		HashMap<String, List<String>>map=new HashMap<String, List<String>>();
		while(start<=end) {
			char ch[]=str[start].toCharArray();
			Arrays.sort(ch);
			List<String>list=new ArrayList<String>();
			list.add(str[start]);
			if(map.containsKey(Arrays.toString(ch))) {
				List<String>lstr = map.get(Arrays.toString(ch));
				lstr.add(str[start]);
				map.put(Arrays.toString(ch), lstr);
			}else {
				map.put(Arrays.toString(ch), list);
			}
			start++;
		}
		List<List<String>>allValues = new ArrayList<>();
        for (List<String> values : map.values()) {
            allValues.add(values);
        }
        return allValues;
    }
}