package com.personal;

/**
 * 测试递归结构
 * 1、递归头
 * 2、递归体
 */
public class TestDiGui {

    static int i = 10;

    public static void a(){
        System.out.println("方法a被调用"+i+"次");
        i--;
        if (i>=0){//递归头 递归结束条件
            a();  //递归体
        }
    }

    public static void main(String[] args) {
        a();
    }
}
