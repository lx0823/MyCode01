package com.objectoriented;
/**
 * @Project: com.objectoriented.TestConstructReload
 * @description: 测试构造方法重载
 * @author: xuanlim
 * @date: 2020-8-8 14:03
 * @version: 1.0
 */
public class TestConstructReload {

    int i;
    int n;

    //当定义了有参构造器，必须手动定义无参构造器
    TestConstructReload(){

    }

    TestConstructReload(int i){
        this.i = i;
    }

    TestConstructReload(int i,int n){
        this.i = i;
        this.n = n;
    }

    public static void main(String[] args) {
        TestConstructReload info = new TestConstructReload();
        TestConstructReload info2 = new TestConstructReload(1);
        TestConstructReload info3 = new TestConstructReload(1,2);
    }


}
