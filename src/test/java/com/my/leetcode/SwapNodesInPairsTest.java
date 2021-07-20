package com.my.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SwapNodesInPairsTest {

    private SwapNodesInPairs swapNodesInPairs;

    @BeforeEach
    public void setUp() {
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @Test
    public void test_whenListContains4Elements_thenSwapIsOk() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = createList(4);

        SwapNodesInPairs.ListNode expected =
                swapNodesInPairs.new ListNode(2);
        SwapNodesInPairs.ListNode expectedTwo =
                swapNodesInPairs.new ListNode(1);
        expected.next = expectedTwo;
        SwapNodesInPairs.ListNode expectedThree =
                swapNodesInPairs.new ListNode(4);
        expectedTwo.next = expectedThree;
        SwapNodesInPairs.ListNode expectedFour =
                swapNodesInPairs.new ListNode(3);
        expectedThree.next = expectedFour;

        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        SwapNodesInPairs.ListNode expectedNode = expected;
        SwapNodesInPairs.ListNode actualNode = actual;

        assertNotNull(actualNode, "Head should not be null");

        validateList(expectedNode, actualNode);

    }

    @Test
    public void test_whenListContains6Elements_thenSwapIsOk() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = createList(6);

        SwapNodesInPairs.ListNode expected =
                swapNodesInPairs.new ListNode(2);
        SwapNodesInPairs.ListNode expectedTwo =
                swapNodesInPairs.new ListNode(1);
        expected.next = expectedTwo;
        SwapNodesInPairs.ListNode expectedThree =
                swapNodesInPairs.new ListNode(4);
        expectedTwo.next = expectedThree;
        SwapNodesInPairs.ListNode expectedFour =
                swapNodesInPairs.new ListNode(3);
        expectedThree.next = expectedFour;

        SwapNodesInPairs.ListNode expectedFive =
                swapNodesInPairs.new ListNode(6);
        expectedFour.next = expectedFive;
        SwapNodesInPairs.ListNode expectedSix =
                swapNodesInPairs.new ListNode(5);
        expectedFive.next = expectedSix;


        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        SwapNodesInPairs.ListNode expectedNode = expected;
        SwapNodesInPairs.ListNode actualNode = actual;

        assertNotNull(actualNode, "Head should not be null");

        validateList(expectedNode, actualNode);

    }

    @Test
    public void test_whenListContainsOddElements_thenSwapIsOk() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = createList(5);

        SwapNodesInPairs.ListNode expected =
                swapNodesInPairs.new ListNode(2);
        SwapNodesInPairs.ListNode expectedTwo =
                swapNodesInPairs.new ListNode(1);
        expected.next = expectedTwo;
        SwapNodesInPairs.ListNode expectedThree =
                swapNodesInPairs.new ListNode(4);
        expectedTwo.next = expectedThree;
        SwapNodesInPairs.ListNode expectedFour =
                swapNodesInPairs.new ListNode(3);
        expectedThree.next = expectedFour;

        SwapNodesInPairs.ListNode expectedFive =
                swapNodesInPairs.new ListNode(5);
        expectedFour.next = expectedFive;

        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        SwapNodesInPairs.ListNode expectedNode = expected;
        SwapNodesInPairs.ListNode actualNode = actual;

        assertNotNull(actualNode, "Head should not be null");

        validateList(expectedNode, actualNode);

    }

    @Test
    public void test_whenHeadIsEmpty_thenReturnEmptyHead() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = swapNodesInPairs.new ListNode();

        SwapNodesInPairs.ListNode expected = swapNodesInPairs.new ListNode();

        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        SwapNodesInPairs.ListNode expectedNode = expected;
        SwapNodesInPairs.ListNode actualNode = actual;

        assertNotNull(actualNode, "Head should not be null");

        validateList(expectedNode, actualNode);

    }

    @Test
    public void test_whenOneElement_thenReturnSameElement() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = swapNodesInPairs.new ListNode(1);

        SwapNodesInPairs.ListNode expected = swapNodesInPairs.new ListNode(1);

        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        SwapNodesInPairs.ListNode expectedNode = expected;
        SwapNodesInPairs.ListNode actualNode = actual;

        assertNotNull(actualNode, "Head should not be null");

        validateList(expectedNode, actualNode);

    }

    @Test
    public void test_whenHeadIsNull_thenReturnEmptyHead() throws CloneNotSupportedException {

        SwapNodesInPairs.ListNode head = null;

        SwapNodesInPairs.ListNode expected = null;

        SwapNodesInPairs.ListNode actual = swapNodesInPairs.swapPairs(head);

        assertEquals(expected, actual, "The head should be null");

    }

    @Test
    public void test_whenObjectCloned_thenShouldHaveSameValues() throws CloneNotSupportedException {
        SwapNodesInPairs.ListNode head = createList(4);

        SwapNodesInPairs.ListNode clone = (SwapNodesInPairs.ListNode) head.clone();

        assertEquals(head.val, clone.val);
        assertEquals(head.next.val, clone.next.val);
        assertEquals(head.next.next.val, clone.next.next.val);
        assertEquals(head.next.next.next.val, clone.next.next.next.val);

    }

    @Test
    public void test_whenObjectClonedAndCopyModified_thenShouldHaveDifferentValues() throws CloneNotSupportedException {
        SwapNodesInPairs.ListNode head = createList(4);

        SwapNodesInPairs.ListNode clone = (SwapNodesInPairs.ListNode) head.clone();
        clone.val = 1000;
        clone.next = swapNodesInPairs.new ListNode(5000);

        assertNotEquals(head.val, clone.val);
        assertNotEquals(head.next, clone.next);

    }

    private SwapNodesInPairs.ListNode createList(int n) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        SwapNodesInPairs.ListNode previous = null, current = null, head = null;

        for (int i = 0; i < n;i++) {
            current =
                    swapNodesInPairs.new ListNode(i+1);
            if (head == null) {
                head = current;
            } else {
                previous.next = current;
            }
            previous = current;

        }

        return head;
    }

    private void validateList(SwapNodesInPairs.ListNode expectedNode,
                              SwapNodesInPairs.ListNode actualNode) {
        while(expectedNode != null) {
            assertEquals(expectedNode.val, actualNode.val, "The value in the " +
                    "list is not the same");
            expectedNode = expectedNode.next;
            actualNode = actualNode.next;
        }
    }

}

//TODO: test a list with only one method