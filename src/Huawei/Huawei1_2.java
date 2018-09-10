package Huawei;

import java.util.*;
public class Huawei1_2 {
    public static String convert(String string){
        StringBuffer sb = new StringBuffer();
        int i;
        for (i=0;i<=string.length()-1;i++){
            char ch;
            if (string.charAt(i) >= 'a'&& string.charAt(i)<='z'){
                ch = (char)(string.charAt(i)-32);
            }else if (string.charAt(i)>='A'&&string.charAt(i)<='Z'){
                ch = (char)(string.charAt(i)+32);
            }else{
                ch = string.charAt(i);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String a = in.nextLine();
            System.out.println(convert(a));

        }
    }
}