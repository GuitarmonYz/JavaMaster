/**
 * Created by zhaoyan on 8/3/17.
 */
import util.ListNode;
public class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode new_head = new ListNode(0);
        ListNode dummy = new_head;
        int carry = 0;
        int sum = 0;
        while (l1 != null || l2 != null){
            if (l1 == null){
                sum = l2.val + carry;
                l2 = l2.next;
            }else if (l2 == null){
                sum = l1.val + carry;
                l1 = l1.next;
            }else if (l1 != null && l2 != null){
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            new_head.next = new ListNode(sum%10);
            new_head = new_head.next;
            carry = sum/10;
        }
        if (carry != 0)
            new_head.next = new ListNode(carry);
        return dummy.next;
    }
}
