package com.datatypesandoperators;
/**
 * @Project: com.datatypesandoperators.TestArithmeticOperator
 * @description: 测试算数运算符
 * @author: xuanlim
 * @date: 2020-6-29 14:45
 * @version: 1.0
 */
public class TestArithmeticOperator {

    public static void main(String[] args) {

       /* 特殊说明：1、运算符规则：
        *          整数运算：（1）如果两个操作数有一个是Long类型，则结果为Long类型
        *                  （2）没有long类型时，结果为int，即使操作数全是byte、short，结果也是int
        *          浮点运算：（1）如果两个操作数有一个是double，则结果为double
        *                  （2）两个操作数都是float时，结果才是float
        */
        long l = 10L;
        int i = 5;
        long s = l+i;

        byte b = 1;
        short t = 2;
        int si = b+t;

        double d = 1.0;
        double sd = d+i;

        float f1 = 1f;
        double sdf = d+f1;

        float f2 = 2f;
        float sf = f1+f2;

        System.out.println("===============");

        /*
         取模运算
         余数符号取决于左边操作数符号
         */
        int m = 9;
        m = m%2;
        System.out.println(m);

        int m2 = -8;
        m2 = m2%3;
        System.out.println(m2);

        int m3 = 8;
        m3 = m3%-3;
        System.out.println(m3);

        System.out.println("===============");

        /*
        一元运算符 ++ --
        ++或--在前，先赋值再++或--
        ++或--在后，先++或--再赋值
         */
        int n = 5;
        int y = n++;
        System.out.println(n);   //6
        System.out.println(y);   //5


        int k = 5;
        int p = ++k;
        System.out.println(k);//6
        System.out.println(p);//6


    }
}
