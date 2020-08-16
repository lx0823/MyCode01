package com.controlstatement;

import java.util.Random;

/**
 * @Project: com.controlstatement.TestMathRandom
 * @description: 测试Math.Random()
 * @author: xuanlim
 * @date: 2020-7-1 15:07
 * @version: 1.0
 * 特殊说明：Math.Random()获取的是【0,1）之间的任意double值
 */
public class TestMathRandom {
    public static void main(String[] args) {
        /*double i = Math.random()*10+1;//获取【1,11)之间的随机数
        System.out.println(i);

        Random random = new Random();
        int m = random.nextInt(10);//获取【0,10）之间的随机整数
        System.out.println(m);

        int n = random.nextInt(10)+2;//获取【2,10)之间的随机整数
        System.out.println(n);*/

        int r = (int)Math.round(Math.random()*10);//获取【0,10)之间的随机整数
        System.out.println(r);




    }
}
