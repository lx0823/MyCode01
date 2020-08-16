package com.controlstatement;

import java.util.Scanner;

/**
 * @Project: com.controlstatement.TestIf
 * @description: 测试选择结构
 * @author: xuanlim
 * @date: 2020-6-30 16:51
 * @version: 1.0
 */
public class TestIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (age>0){
            if (age<=6){
                System.out.println("童年");
            }else if(age>=7&&age<=17){
                System.out.println("少年");
            }else if(age>=18&&age<=40){
                System.out.println("青年");
            }else if (age>=41&&age<=65){
                System.out.println("中年");
            }else{
                System.out.println("老年");
            }
        }else{
            System.out.println("请输入正确年龄");
        }
    }
}
