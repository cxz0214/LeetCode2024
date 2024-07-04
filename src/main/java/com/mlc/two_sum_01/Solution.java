package com.mlc.two_sum_01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int [] twoSum(int[] nums,int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length;i++){
			int r = target - nums[i];
			if(map.containsKey(r)){
				return new int[] {map.get(r),i};
			}
			map.put(nums[i],i);
		}
		return new int[]{-1,-1};
		
	}
}
