package com.objectoriented;
/**
 * @Project: com.objectoriented.TestThisAndStatic
 * @description: 测试this和static
 * @author: xuanlim
 * @date: 2020-8-10 20:59
 * @version: 1.0
 */
public class TestThisAndStatic {
    int id;
    String name;
    String pwd;

    TestThisAndStatic(){

    }

    TestThisAndStatic(int id,String name){
        this.id = id;
        this.name = name;
    }

    TestThisAndStatic(int id,String name,String pwd){
        this(id,name);//this可用于构造方法中，并且必须位于第一句
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        //this.pwd;     static方法中不能中thisff;p
    }


}
