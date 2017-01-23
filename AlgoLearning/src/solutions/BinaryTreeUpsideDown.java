package solutions;
import util.TreeNode;
public class BinaryTreeUpsideDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode reverse(TreeNode root){
		if(root.left == null)
			return root;
		TreeNode newroot = reverse(root.left);
		root.left.left = root.right;
		root.left.right = root;
		root.left = null;
		root.right = null;
		return newroot;
	}
}
