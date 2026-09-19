package Problems.Easy;

import DataStructures.Lists.ListNode;

public class LinkedListModifiers {
    // append
    public static ListNode appendListNode(ListNode head, int newVal) {
        ListNode newNode = new ListNode(newVal);

        if (head == null) {
            return newNode;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

        return head;

    }

    // delete
    public static ListNode deleteListNode(ListNode head, int targetVal) {
        if (head == null) {
            return null; // empty list
        }

        if (head.val == targetVal) {
            return head.next;
        }

        ListNode curr = head;
        while (curr.next != null && curr.next.val != targetVal) {
            curr = curr.next;
        }

        // bypass
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
        return head;

    }

    // print
    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next; // Move to the next node
        }

        System.out.println("null");
    }

    // 2.1 merge two sorted lists.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);

        // edge case 1 : empty lists
        if (list1 == null && list2 == null) {
            return null;
        }

        // edge case 2 : list 1 is empty
        if (list1 == null) {
            return list2;
        }
        // edge case 3 : list 2 is empty
        if (list2 == null) {
            return list1;
        }

        ListNode curr = dummy;
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val){
                curr.next.val = list1.val;
                list1 = list1.next;
            } else {
                curr.next.val = list2.val;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        return dummy.next;

    }
}
