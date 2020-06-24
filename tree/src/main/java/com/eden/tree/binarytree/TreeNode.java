package com.eden.tree.binarytree;

public class TreeNode {

    //权
    private int value;

    //左节点
    private TreeNode leftNode;

    //右节点
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void frontShow() {
        System.out.println(value);
        if (this.leftNode != null) {
            this.leftNode.frontShow();
        }
        if (this.rightNode != null) {
            this.rightNode.frontShow();
        }
    }
}
