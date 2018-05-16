package com.day1;

public interface TestInterface{
    int MAX_CACHE_LINE = 50;  //默认使用public static final修饰
    void out();
    void getData(String msg);
    default void print(String...msg){
        for(String msg:msg)
            System.out.println(msg);
    }
    default void test(){
        System.out.println("默认test()方法");
    }
    static String staticTest(){
        return "接口里的类方法";
    }
}
