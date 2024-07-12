package com.mlc.isomorphic_strings_205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	// 使用两个map
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		
		Map<Character,Character> s2t = new HashMap<>(), t2s = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++){
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			
			if(s2t.containsKey(sc)){
				if(s2t.get(sc) != tc) return false;
			}else{
				if(t2s.containsKey(tc)) return false;
				s2t.put(sc,tc);
				t2s.put(tc,sc);
			}
		}
		return true;
	}
	
	
	// 最初解法使用了一个map，其中的containsValue时间复杂度为O(n),故并不高效
	public boolean isIsomorphic1(String s, String t) {
		if (s.length() != t.length()) return false;
		
		Map<Character, Character> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			
			if (map.containsKey(sc)) {
				// 如果s中的字符已经在map中，并且对应的不是t中的当前字符，则返回false
				if (map.get(sc) != tc) return false;
			} else {
				// 只有当t中的字符没有作为value出现在map中时，才添加映射关系
				if (map.containsValue(tc)) return false;
				map.put(sc, tc);
			}
		}
		
		return true;
	}
}
