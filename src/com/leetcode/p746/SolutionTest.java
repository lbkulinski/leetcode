package com.leetcode.p746;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public final class SolutionTest {
    @Test
    public void test0() {
        int expectedCost = 0;

        int[] costs = {};

        Solution solution = new Solution();

        int cost = solution.minCostClimbingStairs(costs);

        Assertions.assertEquals(expectedCost, cost);
    } //test0

    @Test
    public void test1() {
        int expectedCost = 0;

        int[] costs = {1};

        Solution solution = new Solution();

        int cost = solution.minCostClimbingStairs(costs);

        Assertions.assertEquals(expectedCost, cost);
    } //test1

    @Test
    public void test2() {
        int expectedCost = 1;

        int[] costs = {1, 2};

        Solution solution = new Solution();

        int cost = solution.minCostClimbingStairs(costs);

        Assertions.assertEquals(expectedCost, cost);
    } //test2

    @Test
    public void test3() {
        int expectedCost = 15;

        int[] costs = {10, 15, 20};

        Solution solution = new Solution();

        int cost = solution.minCostClimbingStairs(costs);

        Assertions.assertEquals(expectedCost, cost);
    } //test3

    @Test
    public void test4() {
        int expectedCost = 6;

        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        Solution solution = new Solution();

        int cost = solution.minCostClimbingStairs(costs);

        Assertions.assertEquals(expectedCost, cost);
    } //test4
}