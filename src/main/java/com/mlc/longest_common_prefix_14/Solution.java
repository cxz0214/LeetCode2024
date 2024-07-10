package com.mlc.longest_common_prefix_14;

public class Solution {
	// 最初的解法
	public String longestCommonPrefix1(String[] strs) {
		if(strs.length == 1) return strs[0];

		int minLength = 200;
		for(int i = 0; i < strs.length;i++){
			minLength = Math.min(minLength,strs[i].length());
		}
		int cur = 0;
		while(cur < minLength){
			boolean shouldContinue = true;
			for(int i = 1; i < strs.length;i++){
				if(strs[i].isEmpty() || strs[i-1].isEmpty() || strs[i].charAt(cur) != strs[i-1].charAt(cur)){
					shouldContinue = false;
					break;
				}
			}
			if(!shouldContinue) break;
			cur++;

		}
		return strs[1].substring(0,cur);
	}
	
	public String longestCommonPrefix(String[] strs){
		if(strs.length == 0) return "";
		
		String curCommonPrefix = strs[0];
		for(int i = 1; i < strs.length; i++){
			int minLength = Math.min(curCommonPrefix.length(),strs[i].length());
			int j = 0;
			for(; j < minLength; j++){
				if(curCommonPrefix.charAt(j) != strs[i].charAt(j)){
					break;
				}
			}
			curCommonPrefix = curCommonPrefix.substring(0,j);
		}
		return curCommonPrefix;
	}
	
}
