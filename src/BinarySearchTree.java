import java.util.ArrayDeque;
import java.util.Deque;

public class BinarySearchTree {
	
	public BinarySearchTree() {}
	
	
	boolean isValidBST(TreeNode root) {
		// in order traversal
		if (root == null) {
			return false;
		}
		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
		TreeNode prev = null;
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			if (prev != null || curr.val < prev.val) {
				return false;
			}
			prev = curr;
			curr = curr.right;
		}
		return true;
	}
	
	
}
