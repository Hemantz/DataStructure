package tree.dfs;

import tree.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static tree.node.CreateDummyNode.createNewNode;
/**
 * Tree Node structure
 *                   1
 *                 /   \
 *               2     3
 *              / \   / \
 *             4   5  6  7
 *  Pre-Order(NLR) Traversal in Depth First Search
 *  Post-Order(LRN) Traversal in Depth First Search
 *  Post-Order(LNR) Traversal in Depth First Search
 *
 *  Result PreOrder: [1, 2, 4, 5, 3, 6, 7]
 *  Result PostOrder: [4, 5, 2, 6, 7, 3, 1]
 *  Result InOrder: [4, 2, 5, 1, 6, 3, 7]
 */
public class TraverseNodeDFS {
    public static void main(String[] args) {
        TreeNode root = createNewNode();
        List<Integer> resultPreOrder = new ArrayList<>();
        List<Integer> resultPostOrder = new ArrayList<>();
        List<Integer> resultInsOrder = new ArrayList<>();
        dfsPreOrder(root,resultPreOrder);
        dfsPostOrder(root,resultPostOrder);
        dfsInOrder(root,resultInsOrder);
        System.out.println("Result PreOrder: "+resultPreOrder);
        System.out.println("Result PostOrder: "+resultPostOrder);
        System.out.println("Result InOrder: "+resultInsOrder);

    }

    private static void dfsInOrder(TreeNode node, List<Integer> resultInsOrder) {
        if(node ==null){
            return;
        }
        if(node.getLeft()!= null)
            dfsInOrder(node.getLeft(),resultInsOrder);
        resultInsOrder.add(node.getData());
        if(node.getRight()!= null)
            dfsInOrder(node.getRight(),resultInsOrder);
    }

    private static void dfsPostOrder(TreeNode root, List<Integer> result) {
        if(root == null)
            return;
        if(root.getLeft()!= null) {
            dfsPostOrder(root.getLeft(), result);
        }
        if(root.getRight()!= null) {
            dfsPostOrder(root.getRight(), result);
        }
        result.add(root.getData());
    }

    private static void dfsPreOrder(TreeNode node, List<Integer> result) {
        if(node==null)
            return;
        result.add(node.getData());
        if(node.getLeft()!=null)
            dfsPreOrder(node.getLeft(),result);
        if(node.getRight()!=null)
            dfsPreOrder(node.getRight(),result);
    }
}
