package com.mlc.merge_sorted_array_88;

import java.util.Arrays;

public class Solution {
	
	/**
		整体思路是从后往前合并
	    可以省略k，因为k可以由i和j推得
	    
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n-1;
		// int k = m + n - 1;
		
		while(i >= 0 && j >= 0){
			nums1[i+j+1] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
		}
		
		// i >= 0的情况其实已经代表结束，不需要做什么，所以只处理j >= 0 的情况
		while(j >= 0){
			nums1[i+j+1] = nums2[j--];
		}
	}
	
	// 自己的做法
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		if(n == 0){
			return;
		}
		
		while(i < m){
			if(nums1[i] <= nums2[j]){
				i++;
			}else{
				int tmp = nums1[i];
				nums1[i] = nums2[j];
				nums2[j] = tmp;
				Arrays.sort(nums2);
			}
		}
		
		while(i < m + n ){
			nums1[i++] = nums2[j++];
		}
	}
}
