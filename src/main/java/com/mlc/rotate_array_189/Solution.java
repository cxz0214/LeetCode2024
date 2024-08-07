package com.mlc.rotate_array_189;

public class Solution {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
	}
	
	private void reverse(int[] nums,int i, int j){
		while(i < j){
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
			i++;
			j--;
		}
	}
}
