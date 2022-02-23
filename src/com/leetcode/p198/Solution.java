package com.leetcode.p198;

public class Solution {
    public int rob(int[] numbers) {
        int[] dp = new int[numbers.length + 1];

        dp[dp.length - 1] = numbers[numbers.length - 1];

        for (int i = dp.length - 2; i >= 0; i--) {
            int amount0 = numbers[i];

            int index0 = i + 2;

            if (index0 < numbers.length) {
                amount0 += dp[index0];
            } //end if

            int amount1 = dp[i + 1];

            dp[i] = Math.max(amount0, amount1);
        } //end for

        return dp[0];
    } //rob
}