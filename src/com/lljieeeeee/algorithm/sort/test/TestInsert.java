package com.lljieeeeee.algorithm.sort.test;

import com.lljieeeeee.algorithm.sort.Insert;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 10:59
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class TestInsert {

    public static void main(String[] args) {
         Integer [] array = {123,321,3,12,4,3,6,54,13,44,3,4,3,4,34};
        System.out.println(Arrays.toString(array));
        Insert.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
