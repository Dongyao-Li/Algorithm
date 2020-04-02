package jianzhi_pass1;

import java.util.*;

public class Problem05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        Problem05 p = new Problem05();
        p.push(1);
        p.push(2);
        p.push(3);
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
}
