package com.day1;


public class Person {
    public  static void jump(){
        System.out.println("is now executing jump");
        }
    public  static void  run(){
        jump(); //方法间进行相互调用
        //jump()；    //可以直接简写为这种形式

    }
}