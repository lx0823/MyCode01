package com.datatypesandoperators;
/**
 * @Project: com.datatypesandoperators.TestFAQ
 * @description: 基本数据类型转换常见问题
 * @author: xuanlim
 * @date: 2020-6-29 17:27
 * @version: 1.0
 */
public class TestFAQ {

    public static void main(String[] args) {
        //1、内存溢出
        int years = 5;
        int money = 1000000000;

       // int total = years*money;   //溢出
       // long total1 = years*money;  //溢出
        long total = (long)years*money;
        long total3 = 5L*money;
        System.out.println(total);
        System.out.println(total3);
    }
}
