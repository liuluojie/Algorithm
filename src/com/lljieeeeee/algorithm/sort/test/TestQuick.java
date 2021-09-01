package com.lljieeeeee.algorithm.sort.test;

import com.lljieeeeee.algorithm.sort.Merge;
import com.lljieeeeee.algorithm.sort.Quick;

import java.util.Arrays;

/**
 * @author Lljieeeeee
 * @date 2021/8/31 15:54
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class TestQuick {

    public static void main(String[] args) {
        Integer [] array = {23,431,41,34,54,3,4,546,56765,542,23,22,22};
        System.out.println(Arrays.toString(array));
        Quick.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
