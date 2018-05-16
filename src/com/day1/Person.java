package com.day1;

public class Person {
    String s;
    public  Person(String str) {
        this.s = str;
    }
    public void setS(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }
    @Override
    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Person p =new Person("nionfini");
        System.out.println(p);
    }
}