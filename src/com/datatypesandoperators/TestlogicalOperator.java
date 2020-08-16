package com.datatypesandoperators;
/**
 * @Project: com.datatypesandoperators.TestlogicalOperator
 * @description: 测试逻辑运算符
 * @author: xuanlim
 * @date: 2020-6-29 16:39
 * @version: 1.0
 */
public class TestlogicalOperator {
    /*
    逻辑运算符：逻辑与&：两个操作数都为true，结果才为true，否则是false
              逻辑或|：两个操作数有一个是true，结果为true，否则为false
              短路与&&：只要有一个false，则直接返回false
              短路或||：只要有一个true，则直接返回true
              逻辑非！：！false为true，！true为false
              逻辑异或^：相同为false，不同为true
     */
    public static void main(String[] args) {

        if((1>3)&&(3/0>1)){//只用执行1个操作数就可以返回
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if((1>3)&(3/0>1)){//要执行2个操作数才能返回
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
