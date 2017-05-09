// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
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
        int[] query = new int[P.length];
        
        //0. for문 전체(P.length만큼)
        for(int i=0; i<P.length; i++){
        		//1. p[k]와 q[k]가 같다.
        	if(P[i]==Q[i]){
        		//2. map에서 p[k]의 값에대한 value를 꺼내서 query[k]에 추가한다.
        		query[i]=map.get(Character.toString(S.charAt(P[i])));
        	}else{
        		//1. p[k]와 q[k]가 다르다.
        		//2. 잘라서 소팅
        		String temp = S.substring(P[i], Q[i]+1);
        		char[] chr = temp.toCharArray();
        		Arrays.sort(chr);
        		query[i] = map.get(Character.toString(chr[0]));
        	}
        }
    	return query;
    }
}