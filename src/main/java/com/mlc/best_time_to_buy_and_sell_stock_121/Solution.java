package com.mlc.best_time_to_buy_and_sell_stock_121;

public class Solution {
	// 关键是找到最小和其后面的最大的位置
	public int maxProfit(int[] prices) {
		int cost = Integer.MAX_VALUE;
		int profit = 0;
		
		for(int i = 0; i < prices.length; i++){
			cost = Math.min(cost,prices[i]);
			profit = Math.max(profit,prices[i] - cost);
		}
		return profit;
	}
}
