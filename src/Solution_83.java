/**
 * Created by zhaoyan on 8/1/17.
 */
import util.ListNode;


public class Solution_83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        ListNode res_head = head;
        while (head.next != null){
            head = head.next;
            if (cur.val != head.val){
                cur.next = head;
                cur = head;
            }
        }
        cur.next = null;
        return res_head;
    }

    public ListNode deleteDuplicate_recursive(ListNode head){
        if(head == null|| head.next == null) return head;
        head.next = deleteDuplicate_recursive(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
