import java.util.ArrayList;
import java.util.List;

public class Tree {
    private final TreeNode root;
    public Tree(TreeNode root) {
        this.root = root;
    }
    public List<Integer> getLeafNodes() {
        List<Integer> leafNodes = new ArrayList<>();
        getLeafNodes(root, leafNodes);
        return leafNodes;
    }
    private void getLeafNodes(TreeNode node, List<Integer> leafNodes) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leafNodes.add(node.val);
        }
        getLeafNodes(node.left, leafNodes);
        getLeafNodes(node.right, leafNodes);
    }
    public int getLongestPath() {
        return getLongestPath(root);
    }
    private int getLongestPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getLongestPath(node.left);
        int rightHeight = getLongestPath(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public boolean isEquivalent(Tree other) {
        return isEquivalent(this.root, other.root);
    }
    private boolean isEquivalent(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return isEquivalent(node1.left, node2.left) && isEquivalent(node1.right, node2.right);
    }
}
