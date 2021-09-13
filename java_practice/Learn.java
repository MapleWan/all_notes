package java_practice;

import java.util.Stack;

public class Learn{

    // public static Stack<ListNode> stack_listNode = new Stack<>();
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        l5.next = null;

        ListNode head;

        head = reverseList(l1);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        


    }

    // 输入: 1->2->3->4->5->NULL
    // 输出: 5->4->3->2->1->NULL
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode left = null;
        while(current != null){
            ListNode next = current.next;
            current.next = left;
            left = current;
            current = next;
        }

        return left;

        // 递归实现
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // ListNode newHead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}