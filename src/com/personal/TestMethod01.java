package com.personal;

/**
 * 测试方法
 */
public class TestMethod01 {

    public static void method1(){
        System.out.println("这是一个方法");
    }

    public static int method2(int a,int b,int c){//形式参数
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args){
        method1();

        int sum = method2(1,2,3);//实际参数
        System.out.println(sum);
    }
}
