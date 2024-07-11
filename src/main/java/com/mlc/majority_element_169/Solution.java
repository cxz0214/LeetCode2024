package com.mlc.majority_element_169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	// 摩尔投票法
	public int majorityElement(int[] nums) {
		int x = nums[0];
		int vote = 0;
		
		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i] == x){
				vote++;
			}else if (--vote == 0){
				x = nums[i+1];
			}
		}
		return x;
	}
	
	
	// 最朴素的解法，通过map统计
	public int majorityElement1(int[] nums) {
		if(nums.length == 1) return nums[0];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				int count = map.get(nums[i]);
				if(count >= nums.length / 2){
					return nums[i];
				}
				map.put(nums[i],++count);
			}else{
				map.put(nums[i],1);
			}
		}
		return Integer.MIN_VALUE;
	}
}
