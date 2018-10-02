package com.solarexsoft.datastructure;

/**
 * Created by houruhou on 2018/10/2.
 * Desc:
 */
public class DoubleLinkedList<E> {
    Node<E> first;
    Node<E> last;
    int size;

    public DoubleLinkedList() {
    }

    public void add(E e) {
        linkLast(e);
    }

    private void linkLast(E e) {
        Node<E> newNode = new Node<>(last, e, null);
        Node<E> l = last;
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == size) {
            linkLast(e);
        } else {
            Node<E> target = node(index);
            Node<E> prev = target.prev;
            Node<E> newNode = new Node<>(prev, e, target);
            if (prev == null) {
                first = newNode;
            } else {
                prev.next = newNode;
            }
            target.prev = newNode;
        }
        size++;
    }

    public void remove(int index) {
        Node<E> target = node(index);
        unlinkNode(target);
    }

    private void unlinkNode(Node<E> p) {
        Node<E> prev = p.prev;
        Node<E> next = p.next;

        if (prev == null) {
            // 删除第一个节点
            first = p.next;
        } else {
            prev.next = p.next;
        }

        if (next == null) {
            last = p.prev;
        } else {
            next.prev = p.prev;
        }
    }
    public E get(int index) {
        return node(index).item;
    }

    public Node<E> node(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<E> node = last;
            for (int i = size-1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    public int getSize() {
        return size;
    }

    public static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
