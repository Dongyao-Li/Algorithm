package jianzhi_pass1;
import java.util.*;
public class Problem15 {

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        while (head != null) {
            s.push(head);
            head = head.next;
        }
        ListNode newHead = new ListNode(0);
        ListNode temp = new ListNode(0);
        newHead.next = temp;
        while (!s.isEmpty()) {
            temp.next = s.pop();
            temp = temp.next;
        }
        temp.next = null;
        return newHead.next.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode n = ReverseList(a);
        while (n != null) {
            System.out.print(n.val);
            n = n.next;
        }
    }

}
