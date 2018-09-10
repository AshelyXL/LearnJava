package com.day1;

public class Fan {
    public String fanzhuan(String s){
        if (s.trim().equals(""))
            return s;
        String[] st = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = st.length-1; i >= 0; i--)
            sb.append(st[i] + " ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Fan f = new Fan();
        String s1 ="ni hao ma";
        String s1_fan = f.fanzhuan(s1);
        System.out.println(s1_fan);
    }
}
