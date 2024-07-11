package com.mlc.length_of_last_word_58;

public class Solution {
	
	// 更加优雅的写法
	public int lengthOfLastWord(String s) {
		int count = 0;
		for(int i = s.length() -1; i >= 0; i--){
			if(s.charAt(i) != ' '){
				count++;
			}else if(count != 0){
				break;
			}
		}
		return count;
	}
	
	// 自己的解法
	public int lengthOfLastWord1(String s) {
		int count = 0;
		int index = s.length() -1;
		while(index >= 0){
			while(index >= 0 && !Character.isLetter(s.charAt(index))){
				index --;
			}
			while(index >= 0 && Character.isLetter(s.charAt(index))){
				index--;
				++count;
			}
			return count;
		}
		return count;
	}
}
