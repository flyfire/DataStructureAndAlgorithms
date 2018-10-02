package com.solarexsoft.datastructure;

import java.util.LinkedList;

/**
 * Created by houruhou on 2018/10/2.
 * Desc:
 */
public class LinkedListReverse<E> {
    public void reverse(DoubleLinkedList<E> list) {
        DoubleLinkedList.Node<E> curr = list.first;
        list.last = curr;
        DoubleLinkedList.Node<E> reve = null;
        while (curr != null) {
            DoubleLinkedList.Node<E> temp = curr;
            curr = curr.next;
            temp.next = reve;
            temp.prev = curr;
            reve = temp;
        }
        list.first = reve;
    }

    public DoubleLinkedList.Node<E> reverseRecursively(DoubleLinkedList.Node<E> node){
        if (node == null || node.next == null) {
            return node;
        }
        DoubleLinkedList.Node<E> tail = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return tail;
    }
}
