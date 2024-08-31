class Solution {
    public boolean isIsomorphic(String one, String two) {
        if(one.length()!=two.length())
            return false;
        HashMap<Character, Character>map = new HashMap<>();
        HashMap<Character, Character>map2 = new HashMap<>();

        int start=0, end=one.length()-1;
        while(start<=end){
            if(map.containsKey(one.charAt(start))){
                if(map.get(one.charAt(start))!=two.charAt(start)){
                    return false;
                }
            }
            if(map2.containsKey(two.charAt(start))){
                if(map2.get(two.charAt(start))!=one.charAt(start)){
                    return false;
                }
            }
            map.put(one.charAt(start), two.charAt(start));
            map2.put(two.charAt(start), one.charAt(start));
            start++;
        }
        return true;
    }
}