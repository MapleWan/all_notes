package java_practice;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        Object[] o = s.toArray();
        for(int i =0; i<o.length;i++ ){
            System.out.println(o[i]);
        }
    }
}
