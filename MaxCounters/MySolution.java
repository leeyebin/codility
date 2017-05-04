class Solution {
    public int[] solution(int N, int[] A) {
    	int max = 0;
    	int[] maxCounter = new int[N];
    	
    	for(int i=0; i<A.length; i++){
    		if(A[i]>=1&&A[i]<=N){
    			maxCounter[A[i]-1]++;
    			if(maxCounter[A[i]-1]>max){
    				max = maxCounter[A[i]-1]; 
    			}
    		}else if(A[i]==N+1){
    			for(int j=0; j<maxCounter.length; j++){
    				maxCounter[j]=max;
    			}
    		}
    	}
        return maxCounter;
    }
}