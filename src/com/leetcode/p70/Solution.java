package com.leetcode.p70;

public final class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        } //end if

        int[] dp = new int[n + 1];

        dp[0] = 1;

        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        } //end for

        return dp[n];
    } //climbStairs
}