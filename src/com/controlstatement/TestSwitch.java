package com.controlstatement;

import java.util.Scanner;

/**
 * @Project: com.controlstatement.TestSwitch
 * @description: 测试switch多选择结构
 * @author: xuanlim
 * @date: 2020-6-30 17:03
 * @version: 1.0
 */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级：");
        int age = sc.nextInt();
        switch (age){
            case 1:
                System.out.println("一班");
                break;
            case 2:
                System.out.println("二班");
                break;
            case 3:
                System.out.println("三班");
                break;
            default:
                System.out.println("优等班");
                break;
        }
    }
}
