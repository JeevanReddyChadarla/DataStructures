class Solution {
    public String oddString(String[] words) {
        int start=0, end=words.length-1;
        List<List<Integer>>list = new ArrayList<>();
        while(start<=end){
            char ch[] = words[start].toCharArray();
            int len = ch.length-2, x=0;
            List<Integer>l = new ArrayList<>();
            while(x<=len){
                char a = ch[x+1];
                char b = ch[x];
                l.add(a-b);
                x++;
            }
            list.add(l);
            start++;
        }
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        HashMap<List<Integer>, Integer> index = new HashMap<>();
        int start1=0, ans=0;
        for(List<Integer>l:list) {
            map.put(l, map.getOrDefault(l,0)+1);
            index.put(l, start1);
            start1++;
        }
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans=index.get(entry.getKey());
                break;
            }
        }
        System.out.println(map);
        System.out.println(index);
        System.out.println(ans);
        return words[ans];
    }
}