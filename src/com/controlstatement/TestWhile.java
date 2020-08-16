package com.controlstatement;

import java.util.Scanner;

/**
 * @Project: com.controlstatement.TestWhile
 * @description: 测试while循环结构
 * @author: xuanlim
 * @date: 2020-6-30 17:12
 * @version: 1.0
 */
public class TestWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
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
                sc.nextLine();
                System.out.println("是否进行下一次输入?");
                String sYesOrNo = sc.nextLine();
                if ("是".equals(sYesOrNo)){
                    continue;
                }else{
                    break;
                }
            }else{
                continue;
            }
        }
    }
}
