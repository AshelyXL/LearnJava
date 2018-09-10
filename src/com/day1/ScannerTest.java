package com.day1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()){
            System.out.println("输出内容为：" + sc.next());
        }
    }
}

