package dev.mrgek.problems;

public class DeleteMiddleNodeOfLinkedList {
    public static class ListNode {
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

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;

        ListNode p1 = head;
        int size = 0;

        while (p1 != null) {
            size++;
            p1 = p1.next;
        }


        final var mid = size / 2;

        ListNode p2 = head;

        for (int i = 0; i < mid - 1; i++) {

            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return head;
    }
}
