import java.util.Stack;

class Solution {
	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		for(int i=0; i<H.length; i++){
			if(i==0){
				stack.push(H[0]);
				count++;
			}
			
			if(stack.peek()<H[i]){
				stack.push(H[i]);
				count++;
			}else if(stack.peek()>H[i]){
				while(!stack.isEmpty()&&stack.peek()>H[i]){
						stack.pop();
				}
				
				if(stack.size()!=0){
					if(stack.peek()!=H[i]){
						stack.push(H[i]);
						count++;
					}
				}else{
					stack.push(H[i]);
					count++;
				}
			}
		}
		
		return count;
    }
}