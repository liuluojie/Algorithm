package com.lljieeeeee.algorithm.sort;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 15:40
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Quick {

    public static void sort(Comparable[] comparables) {
        sort(comparables,0, comparables.length-1);
    }

    private static void sort(Comparable[] comparables, int left, int right) {
        if (left>=right) {
            return;
        }
        int partition = partition(comparables, left, right);
        sort(comparables,left,partition - 1);
        sort(comparables,partition + 1,right);
    }

    private static int partition(Comparable[] comparables, int left, int right) {
        Comparable value = comparables[left];
        while (left < right){
            while (left < right && less(value,comparables[right])){
                right--;
            }
            comparables[left] = comparables[right];
            while (left < right && less(comparables[left],value)) {
                left++;
            }
            comparables[right] = comparables[left];
        }
        comparables[left] = value;
        return right;
    }

    private static boolean less(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) <= 0;
    }

    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable temp;
        temp  = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = temp;
    }
}
