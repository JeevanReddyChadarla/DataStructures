class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, profit = Integer.MIN_VALUE;
        int start=0, end=prices.length-1;
        while(start<=end){
            buy = Math.min(prices[start], buy);
            profit = Math.max(prices[start]-buy, profit);
            start++;
        }
        return profit;
    }
}