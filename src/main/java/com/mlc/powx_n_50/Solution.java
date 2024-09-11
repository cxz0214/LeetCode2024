package com.mlc.powx_n_50;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 题目：https://leetcode.cn/problems/powx-n/description/
 */

public class Solution {
	public double myPow(double x, int n) {
		// n可正可负可0，优先处理为0的情况
		if(n == 0){
			return 1;
		}
		return n < 0 ? 1. / pow2(x,-n) : pow2(x,n);
	}
	
	// 递归解法
	private double pow(double x ,int n){
		// 递归终止条件为 n == 1
		if(n == 1){
			return x;
		}
		// 先求x的 n / 2 次方
		double r = pow(x, n / 2);
		// 计算平方
		r *= r;
		// 最后要判断n的奇偶性，偶数直接返回，奇数则还需缺一个x
		return n % 2 == 0 ? r : r * x;
	}
	
	// 非递归解法
	private double pow2(double x ,int n ){
		Deque<Integer> stack = new ArrayDeque<>();
		
		// 把指数存起来，如果n = 7，则存入 7,3,1
		for(stack.push(n); stack.peek() > 1; stack.push(stack.peek() / 2));
		
		double r = x;
		for(stack.pop();!stack.isEmpty();){
			r *= r;
			if(stack.pop() % 2 == 1){
				r *= x;
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().myPow(2,7));
	}
}
