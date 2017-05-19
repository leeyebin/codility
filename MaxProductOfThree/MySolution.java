import java.util.Arrays;


class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int start=0;
        int end = A.length-1;
        
        if(A[start]>=0){
        	return A[end]*A[end-1]*A[end-2];
        }
        if(A[end]<=0){
        	return A[end]*A[end-1]*A[end-2];
        }
        if(A[start]<=0&&A[end]>0){
        	if(A[start]*A[start+1]>A[end-1]*A[end-2]){
        		return A[start]*A[start+1]*A[end];
        	}else{
        		return A[end]*A[end-1]*A[end-2];
        	}
        }
        
        return 0;
    }
}