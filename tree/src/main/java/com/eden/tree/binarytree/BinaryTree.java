package com.eden.tree.binarytree;

public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {
        root.frontShow();

    }
}
