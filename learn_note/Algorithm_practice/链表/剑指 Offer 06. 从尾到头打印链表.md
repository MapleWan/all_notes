# 题目

输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1：
输入：head = [1,3,2]
输出：[2,3,1]
 
限制：
0 <= 链表长度 <= 10000

# 解答

方法1：递归

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }

    public void recur(ListNode node){
        if(node == null) return;
        recur(node.next);
        tmp.add(node.val);
        
    }
}
```

方法2(maple)：使用栈

```java
class Solution {
    // ArrayList<Integer> tmp = new ArrayList<>();
    Stack<Integer> s_tmp = new Stack<>();
    public int[] reversePrint(ListNode head) {

        while(head !=null){
            s_tmp.push(head.val);
            head = head.next;
        }
        
        int size_s = s_tmp.size();        
        int[] res = new int[size_s];
        for (int i =0; i < size_s; i++){
            res[i] = s_tmp.pop();
        }
        return res;
    }

}
```

栈思想的另一种使用方法：

```java
class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
    return res;
    }
}
```

