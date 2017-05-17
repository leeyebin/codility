package codility.Distinct;

import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        
        for(int a : A){
        	hashset.add(a);
        }
        
    	return hashset.size(); 
    }
}