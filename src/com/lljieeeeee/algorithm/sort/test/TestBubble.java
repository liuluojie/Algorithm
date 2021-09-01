package com.lljieeeeee.algorithm.sort.test;

import com.lljieeeeee.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 16:50
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class TestBubble {

    public static void main(String[] args) {
        Integer [] array = {3, 5, 6, 2, 5, 73, 5, 7, 5, 3, 2};
        System.out.println(Arrays.toString(array));
        Bubble.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
