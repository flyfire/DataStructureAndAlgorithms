package com.solarexsoft.datastructure;

import java.util.Stack;

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

    public <T> void preOrder(Node<T> root) {
        if (root == null) {
            return;
        } else {
            Stack<Node<T>> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                // 前序遍历先访问节点
                Node<T> node = stack.pop();
                System.out.println("PreOrder --> " + node.data);
                // 前序遍历先访问左子树，后访问右子树，所以右子树先入栈，左子树后入栈
                if (node.rightChild != null) {
                    stack.push(node.rightChild);
                }
                if (node.leftChild != null) {
                    stack.push(node.leftChild);
                }
            }
        }
    }
}
