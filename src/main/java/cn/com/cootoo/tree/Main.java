package cn.com.cootoo.tree;

import java.util.List;

/**
 * Created by zhaoxiang
 * Date 2020/3/17 8:51 下午
 * Description
 */
public class Main {


    public static void main(String[] args) {
        char[] ss = "".toCharArray();

    }

    private void qianxu(TreeNode node, List<Integer> res) {
        if (node != null) {
            res.add(node.val);
            qianxu(node.left, res);
            qianxu(node.right, res);
        }
    }

    public int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return Math.max(left, right) + 1;
    }

    private boolean same(TreeNode lnode, TreeNode rnode) {
        if (lnode == null && rnode == null) return true;
        if (lnode == null || rnode == null) return false;
        return (lnode.val == rnode.val) && same(lnode.left, rnode.right) && same(lnode.right, rnode.left);
    }

    class TreeNode {

        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
