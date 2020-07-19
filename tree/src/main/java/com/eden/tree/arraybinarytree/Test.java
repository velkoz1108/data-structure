package com.eden.tree.arraybinarytree;

/**
 * @author : eden
 * @date : 2020-7-19 11:56
 */
public class Test {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(data);
        arrayBinaryTree.frontShow(0);
    }
}
