package com.mlc.valid_parentheses_20;

public class Solution {
	// 最初的解法
//	public boolean isValid(String s) {
//		Stack<Character> stack = new Stack<>();
//		for(int i = 0; i < s.length();i++){
//			if(stack.isEmpty()){
//				stack.push(s.charAt(i));
//				continue;
//			}
//			char m = getMatchCharacter(stack.peek());
//			if(m == '*') return false;
//
//			if(m == s.charAt(i)){
//				stack.pop();
//				continue;
//			}
//			stack.push(s.charAt(i));
//		}
//		return stack.isEmpty();
//	}
//
//	private char getMatchCharacter(char c){
//		switch (c){
//			case '(':
//				return ')';
//			case '[':
//				return ']';
//			case '{':
//				return '}';
//			default:
//				return '*';
//		}
//	}
	
	// 高效一点的解法
	char[] stack = new char[s.length()];
	int index = -1;

        for(int i = 0 ; i < s.length();i++){
		char c = s.charAt(i);
		if(index < 0){
			stack[++index] = c;
			continue;
		}
		if(c == '(' || c == '[' || c == '{'){
			stack[++index] = c;
		}else{
			char m = stack[index];
			if(c == ')' && m == '(' || c == ']' && m == '[' || c == '}' && m == '{'){
				index--;
			}else{
				return false;
			}
			
		}
	}return index < 0;


}
