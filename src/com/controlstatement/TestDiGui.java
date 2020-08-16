package com.controlstatement;
/**
 * @Project: com.controlstatement.TestDiGui
 * @description: 测试递归结构
 * @author: xuanlim
 * @date: 2020-7-1 18:17
 * @version: 1.0
 * 特殊说明：递归结构是自身调用自身的结构
 *         递归缺点：递归调用会占用大量的堆栈，内存耗用多，在递归调用层次多时速度要比循环慢的多
 *         任何能用递归解决的问题也能用迭代解决
 */
public class TestDiGui {
    public static void main(String[] args) {
        System.out.println("递归：计算n!");
        long d1 = System.currentTimeMillis();
        long n = fun(1000000000);
        long d2 = System.currentTimeMillis();
        System.out.println(n);
        System.out.println("计算n!,耗时："+(d2-d1));

    }

    public static long fun(int n){
        if(n==1){
            return 1;
        }else{
            return n*fun(n-1);
        }
    }
}
