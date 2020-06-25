package com.eden.tree.binarytree;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        root.setLeftNode(new TreeNode(3, new TreeNode(2), new TreeNode(7)));
        root.setRightNode(new TreeNode(5, new TreeNode(4), new TreeNode(9)));

        System.out.println("==================前序遍历==================");
        //前序遍历
        binaryTree.frontShow();

        //转数组
        List<Integer> list = binaryTree.frontList();
        System.out.println(list);

        //查询
        TreeNode result = binaryTree.search(5);
        System.out.println(result);

        System.out.println("==================中序遍历==================");
        //中序遍历
        binaryTree.midShow();

        System.out.println("==================后序遍历==================");
        //后序遍历
        binaryTree.afterShow();


    }
}
