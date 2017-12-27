import util.TreeNode;

/**
 * Created by zhaoyan on 8/3/17.
 */
public class Solution_156 {
    public TreeNode upsideDownBT(TreeNode root) {
        if (root == null || root.left == null)
            return root;
        TreeNode new_root = upsideDownBT(root.left);

        root.left.left = root.right;
        root.left.right = root;

        root.left = null;
        root.right = null;
        return new_root;
    }
}
