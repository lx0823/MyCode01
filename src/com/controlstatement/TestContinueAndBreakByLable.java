package com.controlstatement;
/**
 * @Project: com.controlstatement.TestContinueAndBreakByLable
 * @description: 测试带标签的continue、break
 * @author: xuanlim
 * @date: 2020-7-1 17:30
 * @version: 1.0
 */
public class TestContinueAndBreakByLable {

    public static void main(String[] args) {
        label1: for (int i = 0; i < 6; i++) {
            if (i<=2){
                continue label1;
            }
            label2: for (int j = 1; j < 4; j++) {
                if(j%2==0){
                    break label1;
                }
                System.out.println("j:"+j);
            }
            System.out.println("i:"+i);
        }
    }
}
