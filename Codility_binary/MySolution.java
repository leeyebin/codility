class Solution {
	    public int solution(int N) {
	    	// write your code in Java SE 8
	        int Count = 0;
	    	int tmpCount = 0;
	    	
	    	while(N!=1){
	    		if(N%2==1){
	    			N/=2;
	    			tmpCount = 0 ;
	    		}else if(N%2==0){
	    			N/=2;
	    			tmpCount++;
	    			if(tmpCount>Count){
	    				Count = tmpCount;
	    			}
	    		}
	    	}
	        
	        return Count;
	    }
	}