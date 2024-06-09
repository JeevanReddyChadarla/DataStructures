class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        int start=0, end=str.length-1, start2=0, end2=end;
        String ans="";
        while(start<=end){
            String st = str[start];
            str[start] = str[end];
            str[end] = st;
            start++;
            end--;
        }
        while(start2<=end2){
            ans+=str[start2];
            ans = start2!=end2 ? ans+" ":ans;
            start2++;
        }
        return ans;
}
}