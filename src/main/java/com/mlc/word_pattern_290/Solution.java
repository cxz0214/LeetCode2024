package com.mlc.word_pattern_290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	// 与205一个套路
	public boolean wordPattern(String pattern, String s) {
		Map<Character,String> p2s = new HashMap<>();
		Map<String,Character> s2p = new HashMap<>();
		String[] array = s.split(" ");
		if(pattern.length() != array.length) return false;
		
		for(int i = 0 ; i < pattern.length();i++){
			Character c = pattern.charAt(i);
			if(p2s.containsKey(c)){
				if(!p2s.get(c).equals(array[i])) return false;
			}else{
				if(s2p.containsKey(array[i])) return false;
				p2s.put(c,array[i]);
				s2p.put(array[i],c);
			}
		}
		return true;
	}
}
