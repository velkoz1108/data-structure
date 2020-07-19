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
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    public List<Integer> frontList() {
        return root.frontList();
    }

    public TreeNode search(int i) {
        return root.search(i);
    }

    public void delete(int i) {
        if (root.getValue() == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}
