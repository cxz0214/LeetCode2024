package com.mlc.longest_substring_without_repeating_characters_03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if(s.isEmpty()) return 0;
		Map<Character,Integer> charIndexMap = new HashMap<>();
		int ans = 0;
		for(int end = 0, start = 0; end < s.length(); end++){
			char curChar = s.charAt(end);
			if(charIndexMap.containsKey(curChar)){
				start = Math.max(start,charIndexMap.get(curChar) + 1);
			}
			charIndexMap.put(curChar,end);
			ans = Math.max(ans,end - start + 1);
		}
		return ans;
	}
}
