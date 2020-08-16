package com.datatypesandoperators;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Project: com.datatypesandoperators.TestBigDecimal
 * @description: 测试Bigdecimal类使用
 * @author: xuanlim
 * @date: 2020-6-29 11:42
 * @version: 1.0
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));

        double a = 1.0;
        for (int i = 0; i < 5; i++) {
            a -= 0.1;
        }


        System.out.println(bd);//0.5
        System.out.println(a);//0.5000000000000001
    }
}
