import util.ListNode;
import util.Solution;
import util.TreeNode;

/**
 * Created by zhaoyan on 8/8/17.
 */
public class Solution_109 implements Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return buildTree(head, null);
    }
    private TreeNode buildTree(ListNode head, ListNode tail){
        if (head == tail) return null;
        ListNode mid = findMid(head, tail);
        TreeNode node = new TreeNode(mid.val);
        node.left = buildTree(head, mid);
        node.right = buildTree(mid.next, tail);
        return node;
    }
    private ListNode findMid(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
