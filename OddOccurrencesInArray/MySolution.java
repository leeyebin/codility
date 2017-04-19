class Solution {
    public int solution(int[] A) {
        int Max = 0;
    	int[] B = new int[1000000];
        for(int i=0; i<A.length; i++){
        	B[A[i]]++;
        	if(Max<A[i]){
        		Max=A[i];
        	}
        }
        
        //0ÀÌ ¾Æ´Ñ È¦¼ö
        for(int j=0; j<=Max; j++){
        	if(B[j]%2==1&&B[j]!=0){
        		return j;
        	}
        }
        
    	return 0;
    }
}