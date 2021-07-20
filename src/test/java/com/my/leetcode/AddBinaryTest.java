package com.my.leetcode;

import com.my.leetcode.AddBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    public void test_when3Plus1_then4() {

        AddBinary addBinary = new AddBinary();
        String a = "11";
        String b = "1";
        String expected = "100";

        String actual = addBinary.addBinary(a, b);

        assertEquals(expected, actual, "Answer should be 100");

    }

    @Test
    public void test_whenAStringIsSmaller_thenOk() {

        AddBinary addBinary = new AddBinary();
        String a = "110";
        String b = "10001";
        String expected = "10111";

        String actual = addBinary.addBinary(a, b);

        assertEquals(expected, actual, "Answer should be 10111");

    }

    @Test
    public void test_whenBIsZero_thenOk() {

        AddBinary addBinary = new AddBinary();
        String a = "101";
        String b = "0";
        String expected = "101";

        String actual = addBinary.addBinary(a, b);

        assertEquals(expected, actual, "Answer should be 101");

    }

}