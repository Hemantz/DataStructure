package tree.node;

public class CreateDummyNode {
    /**
     * Tree Node structure
     *                   1
     *                 /   \
     *               2     3
     *              / \   / \
     *             4   5  6  7
     */
    public static TreeNode createNewNode() {

        TreeNode leftTreeNode = getNode(
                getNode(null,null,4),
                getNode(null,null,5),
                2);
        TreeNode rightTreeNode = getNode(
                getNode(null,null,6),
                getNode(null,null,7),
                3);

        TreeNode root = getNode(leftTreeNode, rightTreeNode,1);
        return root;
    }

    private static TreeNode getNode(TreeNode leftTreeNode, TreeNode rightTreeNode, int data) {
        return new TreeNode( rightTreeNode,leftTreeNode,data);
    }
}
