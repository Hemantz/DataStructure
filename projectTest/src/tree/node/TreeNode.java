package tree.node;


public class TreeNode {
    TreeNode right;
    TreeNode left;
    int data;

    public TreeNode() {
    }
    public TreeNode(TreeNode right, TreeNode left, int data) {
        this.right = right;
        this.left = left;
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "right=" + right +
                ", left=" + left +
                ", data=" + data +
                '}';
    }
}
