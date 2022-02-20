package com.leetcode.p509;

public final class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } //end if

        int[] dp = new int[n + 1];

        dp[0] = 0;

        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        } //end for

        return dp[n];
    } //fib
}