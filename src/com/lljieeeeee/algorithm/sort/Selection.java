package com.lljieeeeee.algorithm.sort;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 16:56
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Selection {

    public static void sort(Comparable [] comparable) {
        for (int i = 0; i<comparable.length -1;i++) {
            int minIndex = i;
            for (int j = i+1;j<comparable.length;j++) {
                if (greater(comparable[minIndex],comparable[j])) {
                    minIndex = j;
                }
            }
            exchange(comparable,i,minIndex);
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
