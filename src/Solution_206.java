import util.ListNode;

/**
 * Created by zhaoyan on 8/1/17.
 */
public class Solution_206 {
    public ListNode reverseList_recursive(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode new_head = reverseList_recursive(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }
    public ListNode reverseList_iterative(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
