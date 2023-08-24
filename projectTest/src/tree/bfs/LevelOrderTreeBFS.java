package tree.bfs;

import tree.node.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static tree.node.CreateDummyNode.createNewNode;

public class LevelOrderTreeBFS {

    public static void main(String[] args) {
        TreeNode root = createNewNode();
        System.out.println(levelOrder(root));

    }

    public static List<List<Integer>> levelOrder(TreeNode rootNode){
        /**
         * Tree Node structure
         *                   1
         *                 /   \
         *               2     3
         *              / \   / \
         *             4   5  6  7
          */

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(rootNode == null){
            return wrapList;
        }
        queue.offer(rootNode);
        while(!queue.isEmpty()){

            LinkedList<Integer> list = new LinkedList<>();
            int levelNum = queue.size();
            for(int i = 0; i<levelNum ; i++){
                if(queue.peek().getLeft()!=null){
                    queue.offer(queue.peek().getLeft());
                }
                if(queue.peek().getRight()!=null){
                    queue.offer(queue.peek().getRight());
                }
                list.add(queue.poll().getData());
            }
            wrapList.add(list);
        }
        return wrapList;
    }



}
