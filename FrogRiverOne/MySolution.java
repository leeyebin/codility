import java.util.HashSet;

class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
		for(int j=1; j<=X; j++){
			set.add(j);
		}
			
		for(int i=0; i<A.length; i++){
			if(A[i] <= X){
				set.remove(A[i]);
			}
			if(set.isEmpty()){
				return i;
			}
		}		
		
		return -1;
    }
}