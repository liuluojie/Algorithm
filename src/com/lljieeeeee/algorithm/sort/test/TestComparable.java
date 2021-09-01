package com.lljieeeeee.algorithm.sort.test;

import com.lljieeeeee.algorithm.sort.Student;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 16:28
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class TestComparable {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setUsername("lalala");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setUsername("hahaha");
        s2.setAge(20);

        System.out.println(getMax(s1, s2));
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        }
        return c2;
    }
}
