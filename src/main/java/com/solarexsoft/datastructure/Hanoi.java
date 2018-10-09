package com.solarexsoft.datastructure;

/**
 * Created by houruhou on 2018/10/9.
 * Desc:
 */
public class Hanoi {
    public static void hanoi(int n, String start, String middle, String end) {
        if (n <= 1) {
            System.out.println(start + "-->" + end); // 只有一个盘子时从开始位置移动到结束位置
        } else {
            hanoi(n-1, start, end, middle); // 将n-1个盘子从start位置以end为中间节点移动到middle位置
            System.out.println(start + "-->" + end);
            hanoi(n-1, middle, start, end); // 将n-1个盘子从middle位置以start为中间节点移动到end位置
        }
    }

    public static void main(String[] args) {
        hanoi(5, "a", "b", "c");
    }
}
