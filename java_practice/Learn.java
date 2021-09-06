package java_practice;

import java.util.ArrayList;
import java.util.Stack;

public class Learn{

    public static ArrayList<Integer> tmp = new ArrayList<>();
    public static Stack<Integer> s_tmp = new Stack<>();
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(2);
        l2.next = l3;
        l3.next = null;

        ListNode head = l1;
        
        while(head !=null){
            System.out.println(head.val);
            s_tmp.push(head.val);
            head = head.next;
        }
        
        int[] res = new int[s_tmp.size()];

        for (int i =0; i <= s_tmp.size(); i++){
            res[i] = s_tmp.pop();
            System.out.println(i);

        }
        
        // for (int i : res) {
        //     System.out.println(i);
        // }
        
    }

    public static void recur(ListNode node){
        if(node == null) return;
        recur(node.next);
        tmp.add(node.val);
        
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}