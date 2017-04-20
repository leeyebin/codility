lass Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        int a=0;
        int b=0;
        
        if(A.length==0){
            return A;
        }
        
        //rotation count가 길이보다 클수도 있다.
        K %= A.length;
        
        if(K==0){
            return A;
        }
        for(int j=K-1; j>=0; j--){
        	result[a++]=A[A.length-1-j];
        }
        b=a;
        for(int i=K; i<A.length; i++){
        	result[b++]=A[i-K];
        }
    	
    	return result;
    }
}