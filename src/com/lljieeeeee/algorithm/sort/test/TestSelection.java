package com.lljieeeeee.algorithm.sort.test;

import com.lljieeeeee.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 17:03
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class TestSelection {

    public static void main(String[] args) {
        Integer [] array = {23,431,41,34,54,3,4,546,56765,542};
        System.out.println(Arrays.toString(array));
        Selection.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
