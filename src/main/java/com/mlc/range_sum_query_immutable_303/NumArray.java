package com.mlc.range_sum_query_immutable_303;


import java.util.ArrayList;
import java.util.List;

public class NumArray {
	private final List<Integer> preSum = new ArrayList<>();
	public NumArray(int[] nums) {
		this.preSum.add(0);
		
		// 前后都加冗余的数字
		int sum = 0;
		for (int num : nums) {
			sum += num;
			preSum.add(sum);
		}
		preSum.add(sum);
	}
	
	public int sumRange(int left, int right) {
		// 注意区间
		return preSum.get(right + 1) - preSum.get(left);
	}
}
