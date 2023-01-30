class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000;
        int today = 0;
        int entire = 0;
        int n = prices.length;
        
        for (int i=0; i<n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            today = prices[i] - min;
            if (entire < today) {
                entire = today;
            }
        }
        return entire;
    }
}