package com.objectoriented;
/**
 * @Project: com.objectoriented.TestConstroct
 * @description:测试构造器和内存分析
 * @author: xuanlim
 * @date: 2020-8-8 13:27
 * @version: 1.0
 */
public class TestConstructAndMemoryAnalysis {
    //成员变量
    double x;
    double y;

    //无参构造方法  没有手动定义，初始化对象的时候会自动定义
    TestConstructAndMemoryAnalysis(){

    }

    //有参构造方法
    TestConstructAndMemoryAnalysis(double _x, double _y){
        x = _x;
        y = _y;
    }

    public double getDistance(TestConstructAndMemoryAnalysis p){
        System.out.println(x);     //3
        System.out.println(p.x);   //0
        System.out.println(y);     //4
        System.out.println(p.y);   //0
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    //方法入口
    public static void main(String[] args) {
        TestConstructAndMemoryAnalysis p = new TestConstructAndMemoryAnalysis(3,4);
        TestConstructAndMemoryAnalysis orign = new TestConstructAndMemoryAnalysis(0,0);

        System.out.println(p.getDistance(orign));
    }


}
