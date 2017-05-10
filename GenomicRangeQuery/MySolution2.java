// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 1);
        map.put("C", 2);
        map.put("G", 3);
        map.put("T", 4);
        int index = -1;
        int[] query = new int[P.length];
        int[][] A = new int[S.length()+1][4];
        /*int P[] = {0,0,1};
		int Q[] = {0,1,1};
		String S = "AC";*/
        
	//2차원 배열에 누적된 수를 세팅
        for(int i=1; i<=S.length(); i++){
        		index = map.get(Character.toString(S.charAt(i-1)))-1;
        		A[i][index] = A[i-1][index]+1;
        		for(int j=0; j<4; j++){
        			if(j!=index){
        				A[i][j] = A[i-1][j];
        			}
        		}
        }
        
	//for문을 돌면서 주어진 범위 안의 수중에서 고르기
        for(int x=0; x<P.length; x++){
        	if(P[x]==Q[x]){
        		query[x]=map.get(Character.toString(S.charAt(P[x])));
        	}else{
        		int k=0;
        		while(query[x]==0){
        			if(A[Q[x]+1][k]-A[P[x]][k]!=0){
        				query[x]=k+1;
        			}
        			k++;
   				}
   			}        		
        }
        
    	return query;
    }
}