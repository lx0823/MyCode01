package com.controlstatement;
/**
 * @Project: com.controlstatement.TestFor
 * @description: 测试for循环
 * @author: xuanlim
 * @date: 2020-6-30 17:57
 * @version: 1.0
 * 特殊说明：1.求1-100之间的累加和
 *         2.循环输出9-1之间的数
 *         3.输出90-1之间能被3整除的数
 *         4.逗号运算符
 *         5.无限循环
 */
public class TestFor {

    public static void main(String[] args) {
        //1.求1-100之间的累加和==================
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        System.out.println(sum);

        //2.循环输出9-1之间的数==================
        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }

        //3.输出90-1之间能被3整除的数================
        for (int i = 90; i > 0; i--) {
            if (i%3==0){
                System.out.println(i);
            }
        }

        //4.逗号运算符================
        for (int i = 1,j=i+10; i < 10; i++,j=i*2) {
            System.out.println("i="+i+"\t"+"j="+j);
        }

        //5.无限循环
        for (;  ; ) {
            System.out.println("无限循环");
        }
    }
}
