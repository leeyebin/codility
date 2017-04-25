class Solution {
    public int solution(int[] A) {
        boolean[] B = new boolean[100001];
		
        for(int i=0; i<A.length; i++){
        	if(A[i]>=0){
        		B[A[i]] = true;
        	}
        }
        
        for(int j=1; j<B.length; j++){
        	if(B[j]==false){
        		return j;
        	}
        }

		return 0;
    }
}

´ñ±Û Áß ±ò²ûÇÏ´Ù°í »ý°¢ÇÏ´Â solution
class Solution {
	public int solution(int[] A) {
		int result = 1;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<A.length; i++){
			set.add(A[i]);
		}
		while(set.contains(result)){
			result++;
		}
		return result;
    }
}