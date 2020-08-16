package com.personal;

import java.util.Scanner;

/**
 * 写一个年薪计算器
 */
public class AnnualSalaryCalculator {

    public static void main(String[] args) {
        System.out.println("输入next直接计算下一个薪水；输入exit结束程序");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("请输入您的月薪:");
            double monthSalary = scanner.nextDouble();
            System.out.println("请输入一年几薪:");
            int count = scanner.nextInt();
            double yearSalary = monthSalary * count;

            System.out.println("您的年薪是：" + yearSalary);

            scanner.nextLine();//遇到scanner.nextInt()后写scanner.nextLine()控制台不让输入的情况，做此处理
            String s = scanner.nextLine();
            if ("next".equals(s)) {
                continue;
            }
            if("exit".equals(s)){
                break;
            }
            if (yearSalary > 100000 && yearSalary < 200000) {
                System.out.println("恭喜您，您的年薪已超过90%的国人");
            }
            if (yearSalary >= 200000) {
                System.out.println("恭喜您，您的年薪已超过95%的国人");
            }
        }
    }
}
