package com.mlc.valid_palindrome_125;

public class Solution {
	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		
		while(i <= j){
			Character left = s.charAt(i);
			Character right = s.charAt(j);
			if(!Character.isLetterOrDigit(left)){
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(right)){
				j--;
				continue;
			}
			
			// 是数字的话不需要额外判断
			if(Character.toLowerCase(left) != Character.toLowerCase(right)){
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
}
