50Á¡
class Solution {
    public int solution(int[] A) {
        int front=0;
        int back=0;
		int min = 0;
        
        for(int i=0; i<A.length-1; i++){
        	for(int j=0; j<=i; j++){
        		front += A[j];
        	}        	
        	
        	for(int k=i+1; k<A.length; k++){
        		back += A[k];
        	}
        	
        	if(i==0){
        		min = Math.abs(front-back);
        	}
        	if(min>=Math.abs(front-back)){
        		min = Math.abs(front-back);
        	}
        	front = 0;
        	back = 0;
        }
        
        return min;
    }
}

100Á¡
class Solution {
    public int solution(int[] A) {
        int front=0;
        int back=0;
		int min = 0;
        
		for(int m=0; m<A.length; m++){
			back += A[m];
		}
		
        for(int i=0; i<A.length-1; i++){
        	front += A[i];
        	back -= A[i];
        	
        	if(i==0){
        		min = Math.abs(front-back);
        	}
        	if(min>=Math.abs(front-back)){
        		min = Math.abs(front-back);
        	}
        }
		
		return min;
    }
}