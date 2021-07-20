package com.my.leetcode;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) throws CloneNotSupportedException {

        ListNode newHead = null;
        if (head != null) {

            if (head != null && head.next == null) { // only one element,
                // nothing to swap
                newHead = new ListNode(head.val);
            } else {
                ListNode cloneHead = (ListNode) head.clone();

                ListNode current = cloneHead, currentTemp = null, nextTemp, prev
                        = null;

                while (current != null && current.next != null) {

                    currentTemp = current;
                    nextTemp = current.next.next;
                    current = currentTemp.next;
                    current.next = currentTemp;
                    current.next.next = nextTemp;

                    if (newHead == null) {
                        newHead = current;
                        prev = newHead;
                    } else {
                        prev.next.next = current;
                        prev = current;
                    }

                    current = current.next.next;
                }
            }

        }

        return newHead;
    }

    public class ListNode implements Cloneable {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        protected Object clone() {

            ListNode head = null, previous = null, current = this;
            while (current != null) {
                if (head == null) {
                    head = new ListNode(this.val);
                    previous = head;
                } else {
                    ListNode node = new ListNode(current.val);
                    previous.next = node;
                    previous = node;
                }
                current = current.next;
            }

            return head;
        }
    }
}
