package com.solarexsoft.datastructure;

/**
 * Created by houruhou on 2018/10/2.
 * Desc:
 */
public class Test {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);

        printList(list);

        new LinkedListReverse<Integer>().reverse(list);

        printList(list);

        printListUsingSize(list);
    }

    private static void printList(DoubleLinkedList<Integer> list) {
        DoubleLinkedList.Node<Integer> node = list.first;
        int i = 0;
        while (node != null) {
            System.out.print(i + "-->" + node.item + "\t");
            i++;
            node = node.next;
        }
        System.out.println();
    }

    private static void printListUsingSize(DoubleLinkedList<Integer> list) {
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print("-->" + i + "-->" + list.get(i) + "\t");
        }
        System.out.println();
    }
}
