package com.leetcode.p746;

public final class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) {
            return 0;
        } //end if

        int[] dp = new int[cost.length + 1];

        for (int i = 2; i < dp.length; i++) {
            int cost0 = dp[i - 1] + cost[i - 1];

            int cost1 = dp[i - 2] + cost[i - 2];

            dp[i] = Math.min(cost0, cost1);
        } //end for

        return dp[cost.length];
    } //minCostClimbingStairs
}