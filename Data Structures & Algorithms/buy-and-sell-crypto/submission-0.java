class Solution {
    public int maxProfit(int[] prices) {
        int maxprof=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            maxprof=Math.max(maxprof,prices[i]-min);
        }
        return maxprof;
    }
}
