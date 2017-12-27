import util.Solution;

public class Solution_155 implements Solution {
    class ListNode {
        int val;
        int min = Integer.MIN_VALUE;
        ListNode next;
        ListNode (int val) { this.val = val; this.next = null; }
    }
    ListNode current;
    /** MIN Stack */
    void push(int x) {
        ListNode curNode = new ListNode(x);
        if (current == null){
            current = curNode;
            current.min = current.val;
        }else {
            curNode.next = current;
            curNode.min = curNode.val < current.min ? curNode.val : current.min;
            current = curNode;
        }
    }

    void pop() {
        current = current.next;
    }

    int top() {
        return current != null ? current.val : null;
    }

    int getMin() {
        return current != null ? current.min : null;
    }
}
