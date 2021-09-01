package com.lljieeeeee.algorithm;

/**
 * @author Lljieeeeee
 * @date 2021/5/27 22:49
 * @url https://www.lljieeeeee.top/
 * @QQ 2015743127
 */
public class LeetCode {

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    public static int numSquares(int n) {
        int res = 0;
        int cnt = 0;
        for(int i = 4 ; i>0;i--) {
            while((i*i) + cnt <= n) {
                cnt += i*i;
                res++;
            }
            if(cnt == n) {
                break;
            }
        }
        return res;
    }
}
