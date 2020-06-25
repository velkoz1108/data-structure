package com.eden.tree.binarytree;

import java.util.List;

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

    public void midShow() {
        root.midShow();
    }

    public void afterShow() {
        root.afterShow();
    }

    public List<Integer> frontList() {
        return root.frontList();
    }

    public TreeNode search(int i) {
        return root.search(i);
    }
}
