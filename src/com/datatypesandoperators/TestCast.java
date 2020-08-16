package com.datatypesandoperators;
/**
 * @Project: com.datatypesandoperators.TestCast
 * @description: 强制类型转换
 * @author: xuanlim
 * @date: 2020-6-29 17:06
 * @version: 1.0
 */
public class TestCast {
    /*

     */
    public static void main(String[] args) {
        double d = 5.65;
        int i = (int)d;//强制类型转换会舍掉小数部分，是舍掉不是四舍五人，有精度损失
        System.out.println(i);

        double d1 = 129;
        byte b = (byte)d1;//超出目标类型的范围，会被截成一个完全不认识的数出来
        System.out.println(b);

    }
}
