class Solution {
    public String minRemoveToMakeValid(String s) {
        int start=0, end=s.length()-1, open=0;
        String ans="";
        while(start<=end){
            if(s.charAt(start)==')' && open==0){
                ans=ans;
            }else if(s.charAt(start)=='('){
                ans=ans+'(';
                open++;
            }else{
                if(s.charAt(start)==')'){
                    open--;
                }
                ans=ans+s.charAt(start);
            }
            start++;
        }
        if(open==0){
            return ans;
        }
        String answer=""; 
        int start1=0, end1=ans.length()-1;
        while(start1<=end1){
            if(open!=0 && ans.charAt(end1)=='('){
                answer=answer;
                open--;
            }
            else{
                answer=answer+ans.charAt(end1);
            }
            end1--;
        }
        String answ="";
        int start2=0, end2=answer.length()-1;
        while(start2<=end2){
            answ=answ+answer.charAt(end2);
            end2--;
        }
        return answ;
    }
}