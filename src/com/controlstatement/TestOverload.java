package com.controlstatement;
/**
 * @Project: com.controlstatement.TestOverload
 * @description: 测试方法重载
 * @author: xuanlim
 * @date: 2020-7-1 18:00
 * @version: 1.0
 * 特殊说明：构成方法重载的条件：1、方法名称相同
 *                         2、形参类型、个数、顺序、返回值类型不同
 *                         3、只有返回值类型不同，不构成方法重载
 *                         4、只有形参的名称不同，不构成方法重载
 */
public class TestOverload {

    public static void main(String[] args) {

    }

    public static void add(int a,int b){    //method1

    }

    /*public static int add(int a,int b){   //method2      method2与method1不构成方法重载  只有返回值类型相同，不构成重载

    }*/

    /*public static void add(int c,int d){    //method3      method3与method1构成方法重载   只有形参名称不同，不构成重载

    }*/

    public static void add(){

    }

    public static int add(int a,int b,int c){

        return 0;
    }

    public static double add(int a,int b,double c){
        return 0;
    }





}
