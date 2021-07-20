package com.my.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 2, b =1, result = 0;

        if (n == 1) return 1;
        if (n == 2) return 2;

        for (int i =3;i<=n;i++) {
            result = a + b;
            b = a;
            a = result;
        }

        return result;
    }

}
