package com.mlc.baseball_game_682;


import netscape.security.UserTarget;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public int calPoints(String[] operations) {
		Deque<Integer> stack = new ArrayDeque<>();
		
		for (String c : operations) {
			switch (c) {
				case "+":
					Integer p1 = stack.pop();
					Integer p2 = stack.pop();
					stack.push(p2);
					stack.push(p1);
					stack.push(p1 + p2);
					break;
				case "D":
					stack.push(stack.peek() * 2);
					break;
				case "C":
					stack.pop();
					break;
				default:
					stack.push(Integer.parseInt(c));
			}
		}

		return stack.stream().mapToInt(Integer::intValue).sum();
	}
}
