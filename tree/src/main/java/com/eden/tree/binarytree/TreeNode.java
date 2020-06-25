package com.eden.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    /**
     * 根节点 -> 左节点 -> 油节点
     */
    public void frontShow() {
        System.out.println(value);

        if (Objects.nonNull(this.leftNode)) {
            this.leftNode.frontShow();
        }

        if (Objects.nonNull(this.rightNode)) {
            this.rightNode.frontShow();
        }
    }

    public void midShow() {
        if (Objects.nonNull(this.leftNode)) {
            this.leftNode.midShow();
        }

        System.out.println(value);

        if (Objects.nonNull(this.rightNode)) {
            this.rightNode.midShow();
        }

    }

    public void afterShow() {
        if (Objects.nonNull(this.leftNode)) {
            this.leftNode.afterShow();
        }

        if (Objects.nonNull(this.rightNode)) {
            this.rightNode.afterShow();
        }

        System.out.println(value);
    }

    public List<Integer> frontList() {
        List<Integer> list = new ArrayList<>();

        list.add(this.value);

        if (Objects.nonNull(this.leftNode)) {
            list.addAll(this.leftNode.frontList());
        }

        if (Objects.nonNull(this.rightNode)) {
            list.addAll(this.rightNode.frontList());
        }

        return list;
    }

    public TreeNode search(int i) {
        if (this.value == i) {
            return this;
        }
        if (Objects.nonNull(this.leftNode)) {
            TreeNode search = this.leftNode.search(i);
            if (Objects.nonNull(search)) {
                return search;
            }
        }
        if (Objects.nonNull(this.rightNode)) {
            TreeNode search = this.rightNode.search(i);
            if (Objects.nonNull(search)) {
                return search;
            }
        }
        return null;
    }
}
