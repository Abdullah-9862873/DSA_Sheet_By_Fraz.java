/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */
public class Best_Time_To_Buy_And_Sell_Stock{
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit_if_today_sold = 0;
        int overall_profit = 0;
        int least_so_far = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < least_so_far){
                least_so_far = prices[i];
            }
            profit_if_today_sold = prices[i] - least_so_far;
            if(overall_profit < profit_if_today_sold){
                overall_profit = profit_if_today_sold;
            }
        }
        System.out.println(overall_profit);
    }
}