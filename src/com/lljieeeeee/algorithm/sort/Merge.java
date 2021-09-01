package com.lljieeeeee.algorithm.sort;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 11:28
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Merge {

    private static Comparable[] assist;

    public static void sort(Comparable[] comparables) {
        assist = new Comparable[comparables.length];
        sort(comparables,0,comparables.length-1);
    }

    private static void sort(Comparable[] comparables, int left, int right) {
        if (left>=right){
            return;
        }
        int middle = left + (right - left) /2;
        sort(comparables,left,middle);
        sort(comparables,middle+1,right);
        merge(comparables,left,middle,right);
    }

    private static void merge(Comparable[] comparables,int left, int middle, int right) {
        int index = left;
        int l = left;
        int r = middle + 1;
        while (l <= middle && r <= right) {
            if (less(comparables[l],comparables[r])) {
                assist[index++] = comparables[l++];
            }else {
                assist[index++] = comparables[r++];
            }
        }
        while (l <= middle) {
            assist[index++] = comparables[l++];
        }
        while (r<=right) {
            assist[index++] = comparables[r++];
        }
        for (int i = left; i<=right; i++) {
            comparables[i] = assist[i];
        }
    }

    private static boolean less(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) < 0;
    }

    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable temp;
        temp  = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = temp;
    }
}
