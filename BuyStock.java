class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Consider the minimum profit.
        int miniElement = prices[0]; // consider minimum as first in the array list.

        for(int i = 1; i < prices.length; i++){
             if(prices[ i ] < miniElement){
                miniElement = prices[ i ];
             }
             maxProfit = maxProfit < prices[ i ] - miniElement ? prices[ i ] - miniElement : maxProfit;
        }
        return maxProfit;
    }
}
