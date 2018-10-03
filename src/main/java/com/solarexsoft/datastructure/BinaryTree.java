package com.solarexsoft.datastructure;

/**
 * Created by houruhou on 2018/10/3.
 * Desc:
 */
public class BinaryTree {
    public static class Node<T> {
        T data;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T data, Node<T> leftChild, Node<T> rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    // 前序遍历，递归算法
    public <T> void preOrderTraverse(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.println("pre --> " + root.data);
        preOrderTraverse(root.leftChild);
        preOrderTraverse(root.rightChild);
    }
    // 中序遍历
    public <T> void midOrderTraverse(Node<T> root) {
        if (root == null) {
            return;
        }
        midOrderTraverse(root.leftChild);
        System.out.println("mid --> " + root.data);
        midOrderTraverse(root.rightChild);
    }

    // 后序遍历
    public <T> void postOrderTraverse(Node<T> root) {
        if (root == null) {
            return;
        }
        postOrderTraverse(root.leftChild);
        postOrderTraverse(root.rightChild);
        System.out.println("post --> " + root.data);
    }
}
