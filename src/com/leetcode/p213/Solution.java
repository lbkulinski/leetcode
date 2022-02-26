package com.leetcode.p213;

import java.util.Arrays;

public class Solution {
    private int robHelper(int[] numbers) {
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
    } //robHelper

    public int rob(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        } //end if

        int startIndex0 = 0;

        int endIndex0 = numbers.length - 1;

        int[] subarray0 = Arrays.copyOfRange(numbers, startIndex0, endIndex0);

        int amount0 = this.robHelper(subarray0);

        int startIndex1 = 1;

        int endIndex1 = numbers.length;

        int[] subarray1 = Arrays.copyOfRange(numbers, startIndex1, endIndex1);

        int amount1 = this.robHelper(subarray1);

        return Math.max(amount0, amount1);
    } //rob
}