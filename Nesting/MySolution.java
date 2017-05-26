import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String S) {
		FakeStack F = new FakeStack();
		for(int k=0; k<S.length(); k++){
			switch(S.charAt(k)){
			case '(':
				F.fakePush(S.charAt(k));
				break;
			case ')':
				if (F.fakeIsNotEmpty()) {
					if (F.fakePeek() == '(') {
						F.fakePop();
					} else {
						return 0;
					}
				}else{
					return 0;
				}
			}
		}
		
		if(F.fakeIsNotEmpty()==false){
			return 1;
		}
		return 0;

    }
}

class FakeStack{
	List<Character> arr = new ArrayList<Character>();
	
	public void fakePush(char c){
		arr.add(c);
	}
	
	public void fakePop(){
		arr.remove(arr.size()-1);
	}
	
	public char fakePeek(){
		return arr.get(arr.size()-1);
	}
	
	public boolean fakeIsNotEmpty(){
		if(arr.size()==0){
			return false;
		}
		return true;
	}
}