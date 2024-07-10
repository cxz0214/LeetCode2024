package com.mlc.remove_duplicate_from_sorted_array_26;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int j = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != nums[j]){
				nums[++j] = nums[i];
			}
		}
		return j+1;
	}
	
	
	// 自己瞎写一通的解法
	public int removeDuplicates1(int[] nums) {
		if(nums.length == 1) return 1;
		int k = 0;
		int cur = 1;
		while(cur < nums.length){
			if(nums[k] < nums[cur]){
				k++;
				cur++;
			}else{
				for(int i = cur; i < nums.length; i++){
					if(nums[i] > nums[k]){
						nums[++k] = nums[i];
						cur = i;
						break;
					}else{
						cur++;
					}
				}
				
			}
		}
		return k + 1;
	}
}
