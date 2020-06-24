package com.eden.tree.binarytree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        root.setLeftNode(new TreeNode(3, new TreeNode(2), new TreeNode(7)));
        root.setRightNode(new TreeNode(5, new TreeNode(4), new TreeNode(9)));

        //前序遍历
        binaryTree.frontShow();
    }
}
