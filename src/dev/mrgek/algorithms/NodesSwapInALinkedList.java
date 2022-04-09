package dev.mrgek.algorithms;

/*
* problem: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
* */

public class NodesSwapInALinkedList {

    static class ListNode {

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
    }

    public ListNode solve(ListNode head, int k) {

        int index = 0;
        ListNode list = head;

        ListNode headElement = null;
        ListNode tailElement = null;

        while (list != null) {

            if ((index + 1) == k) {

                headElement = list;
            }

            index++;

            list = list.next;
        }

        final int size = index;

        index = 0;
        list = head;

        while (list != null) {

            if ((size - index) == k) {

                tailElement = list;
            }

            index++;

            list = list.next;
        }

        final int temp = headElement.val;

        headElement.val = tailElement.val;
        tailElement.val = temp;

        return head;
    }
}
