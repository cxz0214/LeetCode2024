package com.mlc.best_time_to_buy_and_sell_stock_II_122;

public class Solution {
	
	// 高低差的和
	public int maxProfit(int[] prices) {
		int profit = 0;
		
		for(int i = 0; i < prices.length - 1; i++){
			if(prices[i+1] > prices[i]){
				profit += prices[i+1] - prices[i];
			}
		}
		return profit;
	}
}
