package com.controlstatement;
/**
 * @Project: com.controlstatement.TestContinueAndBreak
 * @description:测试continue、break
 * @author: xuanlim
 * @date: 2020-7-1 17:17
 * @version: 1.0
 */
public class TestContinueAndBreak {
    public static void main(String[] args) {
        System.out.println("把100~150之间不能被3整除的数输出，并且每行输出5个");

        int count = 0;
        for (int i = 100; i <=150 ; i++) {
            if(i%3!=0){
                System.out.print(i+"\t");
                count++;
                if (count%5==0){
                    System.out.println();
                }
            }else{
                continue;
            }
        }


        System.out.println();
        System.out.println("当随机数等于5时结束循环");
        while(true) {
            int r = (int)Math.round(Math.random()*10);//获取【0,10)之间的随机整数
            if (r == 5) {
                break;
            }else{
                System.out.println(r);
            }
        }
        System.out.println("=5了");
    }
}
