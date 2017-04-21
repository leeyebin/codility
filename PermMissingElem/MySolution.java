class Solution {
    public int solution(int[] A) {
        int length = A.length+1;
    	int num = 0;
    	for(int i=1; i<=length; i++){
    		num ^= i;
    	}
    	for(int j=0; j<A.length; j++){
    		num ^= A[j];
    	}
    	
    	return num;
    }
}