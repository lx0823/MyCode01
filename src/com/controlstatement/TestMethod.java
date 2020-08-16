package com.controlstatement;
/**
 * @Project: com.controlstatement.TestMethod
 * @description: 测试方法
 * @author: xuanlim
 * @date: 2020-7-1 17:47
 * @version: 1.0
 */
public class TestMethod {

    //main方法，程序的入口
    public static void main(String[] args) {
        String s = sing();//调用sing()方法，字符串s接收sing()方法里返回的字符串
        System.out.println(s);//输出sing()方法返回结果
    }

    //唱歌的方法
    public static String sing(){
        String sReturn = "一班唱‘我爱我的祖国’。";
        return sReturn;
    }
}
