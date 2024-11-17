package com.mlc.jump_game_II_45;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {
	
	// 这个大概理解了，但是还需要在熟悉熟悉
	public int jump(int[] nums) {
		int end = 0;
		int maxPosition = 0;
		int steps = 0;
		
		for(int i = 0; i < nums.length - 1; i++){
			maxPosition = Math.max(maxPosition,nums[i] + i);
			if(i == end){
				end = maxPosition;
				steps ++;
			}
		}
		return steps;
		Executors.newCachedThreadPool()
	}
}
