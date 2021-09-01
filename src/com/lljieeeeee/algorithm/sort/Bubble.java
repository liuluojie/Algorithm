package com.lljieeeeee.algorithm.sort;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 16:35
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 * @description 冒泡排序
 */
public class Bubble {

    public static void sort(Comparable [] comparables) {
        for (int i = 0; i < comparables.length - 1; i++) {
            for (int j = 0; j < comparables.length - i - 1; j++ ) {
                if (greater(comparables[j], comparables[j + 1])) {
                    exchange(comparables, j, j + 1);
                }
            }
        }
    }

    private static boolean greater(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) > 0;
    }

    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable temp;
        temp  = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = temp;
    }
}
