class Solution {
    public int solution(int[] A) {
        int permutation = 0;
        int isPermutation = 0;
        
        for(int j=1; j<=A.length; j++){
        	permutation ^= j;
        }
        
        for(int i=0; i<A.length; i++){
        	isPermutation ^= A[i];
        }
        
        if(isPermutation == permutation){
        	return 1;
        }
        
        return 0;
    }
}