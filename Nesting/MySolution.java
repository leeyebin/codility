import java.util.ArrayList;

class Solution {
	public int solution(String S) {
		FakeStack F = new FakeStack();
		for(int k=0; k<S.length(); k++){
			switch(S.charAt(k)){
			case '(':
				F.FakePush(S.charAt(k));
				break;
			case ')':
				if(F.FakeIsNotEmpty()){
					if(F.FakePeek()=='('){
						F.FakePop();
					}else{
						return 0;
					}
				}else{
					return 0;
				}
			}
		}
		
		if(F.FakeIsNotEmpty()==false){
			return 1;
		}else{
			return 0;
		}
    }
}

class FakeStack{
	ArrayList<Character> arr = new ArrayList<Character>();
	
	public void FakePush(char c){
		arr.add(c);
	}
	
	public void FakePop(){
		arr.remove(arr.size()-1);
	}
	
	public char FakePeek(){
		return arr.get(arr.size()-1);
	}
	
	public boolean FakeIsNotEmpty(){
		if(arr.size()==0){
			return false;
		}else{
			return true;
		}
	}
}