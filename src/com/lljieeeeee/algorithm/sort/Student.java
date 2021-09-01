package com.lljieeeeee.algorithm.sort;

/**
 * @author Lljieeeeee
 * @date 2021/8/30 16:25
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class Student implements Comparable<Student>{

    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
