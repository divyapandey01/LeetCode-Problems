class Solution {
    public int maxProfit(int[] prices) {
        // 1 2 3 4 5 
        int buy = prices[0];//1
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                profit += prices[i]-buy;
                buy=prices[i];
            }
            else{
                buy=prices[i];
            }
        }
        return profit;
    }
}