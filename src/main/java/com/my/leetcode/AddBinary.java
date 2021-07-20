package com.my.leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {

        boolean isALongestString = a.length() >= b.length();
        String longestString = (isALongestString)? a:b;
        String smallString = (isALongestString)? b:a;
        boolean carry = false;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < longestString.length();i++) {

            char aBit = longestString.charAt(longestString.length()-i-1);
            char bBit = (i < smallString.length())?
                    smallString.charAt(smallString.length()-i-1):
                    '0';

            char result = add(aBit, bBit);

            if (carry) {
                result = add(result, '1');
            }

            answer.append(result);

            carry = (aBit == '1' && bBit == '1') ||
                    ((aBit == '1' || bBit == '1') && carry);

        }

        if (carry) {
            answer.append('1');
        }

        return answer.reverse().toString();
    }

    private char add(char a, char b) {
        if ((a == '0' && b == '0') || (a == '1' && b == '1')) {
            return '0';
        }

        return '1';
    }
}