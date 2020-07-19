package com.eden.tree.arraybinarytree;

/**
 * @author : eden
 * @date : 2020-7-19 11:50
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        System.out.println(data[index]);
        //获取左子节点下标
        int leftIndex = 2 * index + 1;
        if (leftIndex < data.length) {
            frontShow(leftIndex);
        }
        //获取右子节点下标
        int rightIndex = 2 * index + 2;
        if (rightIndex < data.length) {
            frontShow(rightIndex);
        }
    }
}
