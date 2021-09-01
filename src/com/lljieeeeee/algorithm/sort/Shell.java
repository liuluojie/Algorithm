package com.lljieeeeee.algorithm.sort;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 11:06
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Shell {

    public static void sort(Comparable [] comparable) {
        int step = comparable.length/2+1;
        while (step>0) {
            for (int i = step; i < comparable.length; i++) {
                for (int j = i; j>=step;j-=step) {
                    if (greater(comparable[j-step],comparable[j])){
                        exchange(comparable,j-step,j);
                    }else {
                        break;
                    }
                }
            }
            step/=2;
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
