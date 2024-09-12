class Solution {
    public int minAddToMakeValid(String s) {
        int start=0, end=s.length()-1;
		int openBrackets=0, closedBrackets=0;
		while(start<=end){
			if(s.charAt(start)=='('){
				closedBrackets++;
			}else if(closedBrackets>0){
				closedBrackets--;
			}else{
				openBrackets++;
			}
			start++;
		}
		
		return openBrackets+closedBrackets;
    }
    // STACK BASED SOLUTION
    // Stack<Character>stack = new Stack<>();
	// 	int start=0, end=s.length()-1, count=0;
	// 	if(s.length()<=1){
	// 		return s.length();
	// 	}
	// 	while(start<=end){
	// 		if(s.charAt(start)=='('){
	// 			stack.push('(');
	// 		}else if(s.charAt(start)==')'){
	// 			if(!stack.isEmpty()){
	// 				stack.pop();
	// 			}else{
	// 				count++;
	// 			}
	// 		}
	// 		start++;
	// 	}
	// 	return count + stack.size();
    // }
}