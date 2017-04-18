class Solution {
	    public int solution(int N) {
	    	int Count = 0;
	    	int tmpCount = 0;
	    	boolean chk=false;
	    	
	    	if(N%2==0){
	    		chk=false;
	    	}
	    	while(N!=1){
	    		if(N%2==1){
	    			N/=2;
	    			if(tmpCount>Count && chk==true){
	    				Count = tmpCount;
	    			}
	    			tmpCount = 0 ;
	    			chk = true;
	    		}else if(N%2==0){
	    			N/=2;
	    			tmpCount++;
	    		}
	    	}
	        
	        return Count;
	    }
	}