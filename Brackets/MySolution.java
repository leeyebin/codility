import java.util.Stack;

class Solution {
	public int solution(String S) {
		Stack<Character> s = new Stack();
		//String S = "{[()()]}";
        for(int i=0; i<S.length(); i++){
        	switch(S.charAt(i)){
        	case '(' :
        	case '{' :
        	case '[' :
        		s.push(S.charAt(i));
        		break;
        	case ')' :
        		if(!s.isEmpty()){
        			if(s.peek()=='('){
            			s.pop();
            		}
        		}
        		break;
        	case '}' :
        		if(!s.isEmpty()){
        			if(s.peek()=='{'){
            			s.pop();
        			}
        		}
        		break;
        	case ']' :
        		if(!s.isEmpty()){
        			if(s.peek()=='['){
            			s.pop();
            		}
        		}
        		break;
        	}
        }
        if(s.isEmpty()){
        	return 1;
        }else{
        	return 0;
        }
	}
}