package com.lljieeeeee.algorithm.sort;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 10:55
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Insert {
    public static void sort(Comparable [] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (greater(comparables[j-1],comparables[j])) {
                    exchange(comparables,j-1,j);
                }else {
                    break;
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
