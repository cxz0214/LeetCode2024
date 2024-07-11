package com.mlc.is_subsequence_392;

public class Solution {
	
	
	// 最初的解法
	public boolean isSubsequence(String s, String t) {
		if(s.length() ==0) return true;
		if(s.length() > t.length()) return false;
		int j = 0;
		// 注意j也不能越界
		for(int i = 0 ; i < t.length() && j < s.length(); i++){
			if(t.charAt(i) == s.charAt(j)){
				j++;
			}
		}
		return j == s.length();
	}
}
