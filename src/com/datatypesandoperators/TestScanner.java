package com.datatypesandoperators;

import java.util.Scanner;

/**
 * @Project: com.datatypesandoperators.TestScanner
 * @description: 测试Scanner类
 * @author: xuanlim
 * @date: 2020-6-29 17:39
 * @version: 1.0
 */
public class TestScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名称：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入部门：");
        String dept = sc.nextLine();
        System.out.println("请输入工资：");
        double salary = sc.nextDouble();


        double d = 3.14D;


    }
}
