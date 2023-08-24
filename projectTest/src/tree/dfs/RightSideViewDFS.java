package tree.dfs;

import tree.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static tree.node.CreateDummyNode.createNewNode;

public class RightSideViewDFS {

    /**
     * Tree Node structure
     *                   1
     *                 /   \
     *               2     3
     *              / \   / \
     *             4   5  6  7
     */
    public static void main(String[] args) {
        TreeNode root = createNewNode();
        List<Integer> result = new ArrayList<>();
        dfs(root,0,result);
        System.out.println(result);
    }

    private static void dfs(TreeNode root, int currentLevel, List<Integer> result) {
        if(root == null){
            return;
        }
        if(currentLevel>= result.size()){
            result.add(root.getData());
        }
        if(root.getRight()!=null){
            dfs(root.getRight(),currentLevel+1,result);
        }
        if(root.getLeft()!=null){
            dfs(root.getLeft(),currentLevel+1,result);
        }
    }
}
