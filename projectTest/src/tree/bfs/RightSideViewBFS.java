package tree.bfs;

import tree.node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static tree.node.CreateDummyNode.createNewNode;

/**
 * Tree Node structure
 *                   1
 *                 /   \
 *               2     3
 *              / \   / \
 *             4   5  6  7
 */
public class RightSideViewBFS {
    public static void main(String[] args) {
        TreeNode root = createNewNode();
        List<Integer> view = rightSideView(root);
        System.out.println(view);
    }

    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> wrapList = new ArrayList<>();
        if(root == null){
            return wrapList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode currentNode = null;
            int currentLevel = queue.size();
            for(int i=0; i<currentLevel; i++){
                 currentNode = queue.poll();
                if(currentNode.getLeft()!=null){
                    queue.offer(currentNode.getLeft());
                }
                if(currentNode.getRight()!=null){
                    queue.offer(currentNode.getRight());
                }
            }
            wrapList.add(currentNode.getData());
        }
    return wrapList;
    }
}
