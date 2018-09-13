package niuke;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Number_1 {
    //方法一：将二进制转化成字符数组
    public int numberOf1(int n){
        char[] c =Integer.toBinaryString(n).toCharArray();
        int count =0;
        for(int i = 0; i<c.length; i++){
            if(c[i] == '1')
                count++;
        }
        return count;
    }

    //方法二：利用自带java函数
    public int numberOf1_2(int n){
        return Integer.bitCount(n);
    }

    public static void main(String[] args){
        Number_1 num = new Number_1();
        System.out.println(num.numberOf1(6));  //1100
        System.out.println(num.numberOf1_2(6));
    }
}
