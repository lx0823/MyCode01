package com.datatypesandoperators;
/**
 * @Project: com.datatypesandoperators.TestChar
 * @description: 测试字符型常量/变量
 * @author: xuanlim
 * @date: 2020-6-29 14:19
 * @version: 1.0
 */
public class TestChar {

    public static void main(String[] args) {
        char a = 'A';
        char b = 'a';

        System.out.println(a+1);
        System.out.println(b+1);

        System.out.println(""+'a'+'\''+'\t'+'\\'+'\n'+'这');

        System.out.println('\u0065');

        System.out.println('\u0000');

        int i = 2;
       /* if(4>i>1){

        }*/
        if(i>1&&i<4){

        }
    }
}
