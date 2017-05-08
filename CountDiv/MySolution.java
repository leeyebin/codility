class Solution {
    public int solution(int A, int B, int K) {
        int count = 0;
    	
    	if(A%K==0 && B%K==0){
    		count = (B/K+1)-A/K;
    	}else if(A%K!=0 && B%K!=0){
    		count = B/K - A/K;
    	}else if(A%K!=0 && B%K==0){
    		count = B/K - A/K;
    	}else if(A%K==0 && B%K!=0){
    		count = (B/K+1) - A/K;
    	}
    	
    	return count;
    }
}