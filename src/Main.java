
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(6);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node2.left = node6;
        node2.right = node7;
        node7.left = node8;

        Tree tree = new Tree(root);
        
        List<Integer> leafNodes = tree.getLeafNodes();
        System.out.println("Leaf nodes: " + leafNodes);

        int longestPath = tree.getLongestPath();
        System.out.println("Longest path: " + longestPath);

        TreeNode root2 = new TreeNode(5);
        TreeNode node21 = new TreeNode(7);
        TreeNode node22 = new TreeNode(3);
        TreeNode node23 = new TreeNode(0);
        TreeNode node24 = new TreeNode(8);
        TreeNode node25 = new TreeNode(5);
        TreeNode node26 = new TreeNode(2);
        TreeNode node27 = new TreeNode(4);
        TreeNode node28 = new TreeNode(6);

        root2.left = node21;
        root2.right = node22;
        node21.left = node23;
        node21.right = node24;
        node24.left = node25;
        node22.left = node26;
        node22.right = node27;
        node27.left = node28;

        Tree tree2 = new Tree(root2);

        boolean isEquivalent = tree.isEquivalent(tree2);
        System.out.println("Equivalent trees: " + isEquivalent);
    }
}
