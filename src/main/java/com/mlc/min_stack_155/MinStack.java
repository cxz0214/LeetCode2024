package com.mlc.min_stack_155;


import java.util.*;


/**
 * 存储两个数字，最后一个是最小值
 */
public class MinStack {
	
	private Deque<List<Integer>> stack = new ArrayDeque<>();
	public MinStack() {
	
	}
	
	public void push(int val) {
		List<Integer> instance = new ArrayList<>();
		instance.add(val);
		instance.add(Math.min(val,getMin()));
		stack.push(instance);
	}
	
	public void pop() {
		stack.pop();
	}
	
	public int top() {
		List<Integer> top = stack.peek();
		return top.get(0);
	}
	
	public int getMin() {
		if(stack.isEmpty())
			return Integer.MAX_VALUE;
		List<Integer> top = stack.peek();
		return top.get(1);
	}
}
