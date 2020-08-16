package com.controlstatement;
/**
 * @Project: com.controlstatement.TestQianTaoXunHuan
 * @description: 测试嵌套循环
 * @author: xuanlim
 * @date: 2020-7-1 14:11
 * @version: 1.0
 */
public class TestQianTaoXunHuan {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        System.out.println("====================");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        System.out.println("打印9*9乘法表");
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }


        System.out.println("打印9*9乘法表");
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j >=i ; j--) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

        System.out.println("用while循环分别计算100以内的奇数及偶数的和，并输出");
        int i = 0;
        int ouSum = 0;
        int jiSum = 0;
        while(i<=100){
            if(i%2==0){
                ouSum+=i;
            }else{
                jiSum+=i;
            }
            i++;
        }
        System.out.println("100以内偶数和："+ouSum);
        System.out.println("100以内偶数和："+jiSum);


        System.out.println("用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。");
        int count = 0; int k = 1;
        while (k <= 1000) {
            if (k % 5 == 0) {
                System.out.print(k + "\t");
                count++;
                if(count%5==0){
                    System.out.println();
                }
            }
            k++;
        }

        System.out.println("======================");
        int ct = 0;
        for (int j = 1; j < 1001; j++) {
            if(j%5==0){
                System.out.print(j+"\t");
                ct++;
                if(ct%5==0){
                    System.out.println();
                }
            }
        }
    }
}
