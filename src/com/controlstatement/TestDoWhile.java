package com.controlstatement;

import java.util.Scanner;

/**
 * @Project: com.controlstatement.TestDoWhile
 * @description: 测试do...While循环
 * @author: xuanlim
 * @date: 2020-6-30 17:21
 * @version: 1.0
 */
public class TestDoWhile {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do{
            s = scanner.nextLine();
            System.out.println("a");
        }while ("s".equals(s));
    }*/

    public static void main(String[] args) {
        String s = "";
        do{
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
            System.out.println("a");
        }while ("s".equals(s));
    }
}
