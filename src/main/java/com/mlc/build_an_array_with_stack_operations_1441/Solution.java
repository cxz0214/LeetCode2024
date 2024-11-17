package com.mlc.build_an_array_with_stack_operations_1441;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> buildArray(int[] target, int n) {
		/**
		 * 这里注意以j为主，每一步进来就Push，小于target[i]时再Pop
		 */
		List<String> ans = new ArrayList<>();
		for(int i = 0, j = 1; i < target.length; j++){
			ans.add("Push");
			if(j < target[i]){
				ans.add("Pop");
			}else{
				i++;
			}
		}
		return ans;
	}
}
