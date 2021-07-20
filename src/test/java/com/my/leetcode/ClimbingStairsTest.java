package com.my.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    public void test_WhenStairs2_then2() {

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int expected = 2;
        int actual = climbingStairs.climbStairs(2);

        assertEquals(expected, actual, "Answer should be 2 steps");

    }

    @Test
    public void test_WhenStairs3_then3() {

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int expected = 3;
        int actual = climbingStairs.climbStairs(3);

        assertEquals(expected, actual, "Answer should be 3 steps");

    }

    @Test
    public void test_WhenStairs1_then1() {

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int expected = 1;
        int actual = climbingStairs.climbStairs(1);

        assertEquals(expected, actual, "Answer should be 1 steps");

    }

    @Test
    public void test_WhenStairs4_then5() {

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int expected = 5;
        int actual = climbingStairs.climbStairs(4);

        assertEquals(expected, actual, "Answer should be 5 steps");

    }

    @Test
    public void test_WhenStairs45_then1134903170() {

        ClimbingStairs climbingStairs = new ClimbingStairs();
        int expected = 1836311903;
        int actual = climbingStairs.climbStairs(45);

        assertEquals(expected, actual, "Answer should be 1134903170 steps");

    }

}