package com.objectoriented;

/**
 * 定义一个典型的类
 */
public class TestClass {
    //属性
    int id;
    String sName;
    int age;
    Computer comp;

    //构造器
    TestClass(){

    }

    TestClass(String sName,int age){
        this.sName = sName;
        this.age = age;
        System.out.println("姓名："+sName+",年龄："+age);
    }

    //方法
    void study(){
        System.out.println(sName+"正在用"+comp.sBrand+"电脑学习");
    }

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.sBrand="联想";

        TestClass student = new TestClass();
        student.sName = "张三";
        student.comp=comp;

        student.study();

        TestClass testClass = new TestClass("王五",18);
        System.out.println("=====================");
        System.out.println(testClass.sName);
        System.out.println(testClass.age);
    }

}

class Computer{
    String sBrand;
}
