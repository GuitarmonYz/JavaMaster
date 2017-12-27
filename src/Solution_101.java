import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by zhaoyan on 8/3/17.
 */
public class Solution_101 {
    public boolean isSymmetric_iterative(TreeNode root){
        if (root == null) return true;
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offerFirst(root.left);
        deque.offerLast(root.right);
        while (!deque.isEmpty()){
            TreeNode left = deque.pollFirst();
            TreeNode right = deque.pollLast();
            if (left.val != right.val)
                return false;
            deque.offerFirst(left.right);
            deque.offerLast(right.left);
            deque.offerFirst(left.left);
            deque.offerLast(right.right);
        }
        return true;
    }
}
