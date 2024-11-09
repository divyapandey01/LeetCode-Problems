class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int p=0;
        int min=prices[0];//7
        for(int i=0;i<n;i++){
            min=Math.min(prices[i],min);//1 1 1 1 1
            p=Math.max(p,prices[i]-min);//0 4 4 5 5
        }
        return p;
    }
}