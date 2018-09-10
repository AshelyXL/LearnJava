package com.day1;

import java.util.*;
public class demo {
    public static String convert(String string){

        char[] ch=string.toCharArray();
        for(int i=0;i<ch.length;i++){
            if( (int)ch[i]>65&&(int)ch[i]<=90){
                ch[i] += 32;
            }else if((int)ch[i]>97&&(int)ch[i]<=122){
                ch[i] -=32;
            }
            else {ch[i]=ch[i];

            }
        }
        string = new String(ch);
        return string;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String a = in.nextLine();
            System.out.println(convert(a));

        }
    }
}