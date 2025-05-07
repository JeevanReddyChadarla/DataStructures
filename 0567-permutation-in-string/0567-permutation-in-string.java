class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer>map = new HashMap<>();
        int start=0, end=s1.length()-1, i=end+1;
        while(start<=end){
            map.put(s1.charAt(start), map.getOrDefault(s1.charAt(start),0)+1);
            start++;
        }
        HashMap<Character, Integer>sample = new HashMap<>(map);
        start=0;
        end=s2.length()-1;
        while(start<=end-i+1){
            for(int j=start; j<start+i;j++){
                if(sample.containsKey(s2.charAt(j))){
                    sample.put(s2.charAt(j), sample.get(s2.charAt(j))-1);
                    if(sample.get(s2.charAt(j))==0){
                        sample.remove(s2.charAt(j));
                    }
                }else{
                    break;
                }
            }
            if(sample.size()==0){
                return true;
            }
            sample.putAll(map);
            start++;
        }
        return false;
    }
}