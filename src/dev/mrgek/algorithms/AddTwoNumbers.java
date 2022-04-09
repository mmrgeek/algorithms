package dev.mrgek.algorithms;

import java.util.Objects;

/*
* problem: https://leetcode.com/problems/add-two-numbers
* */

public class AddTwoNumbers {

    static class ListNode {
        int val = 0;
        ListNode next = null;

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

    private ListNode l3 = null;

    public ListNode solve(ListNode l1, ListNode l2) {

        if (Objects.isNull(l3)) {

            l3 = l1;
        }

        if (Objects.isNull(l1) && Objects.isNull(l2)) {

            return l3;
        }


        if ((l1.val + l2.val) >= 10) {

            if (Objects.isNull(l1.next)) {

                l1.next = new ListNode();
            }

            l1.next.val += 1;
        }

        l1.val = (l1.val + l2.val) % 10;

        if (Objects.isNull(l1.next) && Objects.nonNull(l2.next)) {

            l1.next = new ListNode();
        }

        if (Objects.isNull(l2.next) && Objects.nonNull(l1.next)) {
            l2.next = new ListNode();
        }

        return solve(l1.next, l2.next);
    }

}
