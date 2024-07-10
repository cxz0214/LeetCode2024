package com.mlc.remove_element_27;

public class Solution {
	
	
	// 与26题一个套路
	public int removeElement(int[] nums, int val){
		int ans = 0;
		for(int i = 0 ; i < nums.length; i++){
			if(nums[i] != val){
				nums[ans] = nums[i];
				ans++;
			}
		}
		return ans;
	}
	
	// 最初解法
	public int removeElement1(int[] nums, int val) {
		if(nums.length == 0) return 0;
		int k = 0;
		boolean shouldBreak = false;
		while(k < nums.length && !shouldBreak){
			if(nums[k] == val){
				int j = k + 1;
				for(; j < nums.length; j++){
					if(nums[j] != val){
						swap(nums,k++,j);
						break;
					}
				}
				if(j >= nums.length) shouldBreak = true;
			}else{
				k++;
			}
		}
		return k;
	}
	
	private void swap(int[] nums,int x, int y){
		int tmp = nums[x];
		nums[x] = nums[y];
		nums[y] = tmp;
	}
}
