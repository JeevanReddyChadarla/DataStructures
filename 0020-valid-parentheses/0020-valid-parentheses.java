class Solution {
    public boolean isValid(String str) {
        String closed=")}]";
        if(str.length()==0){
            return true;
        }
        if(str.length()%2==1 || closed.contains(String.valueOf(str.charAt(0)))){
            return false;
        }
        Stack<Character>stack = new Stack<>();
        int start=0, end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)=='('){
                stack.push(')');
            }else if(str.charAt(start)=='{'){
                stack.push('}');
            }else if(str.charAt(start)=='['){
                stack.push(']');
            }else{
                if(start!=end && stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!=str.charAt(start)){
                    return false;
                }
                
            }
            start++;
        }
        return stack.isEmpty();
	}
}