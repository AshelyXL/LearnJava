package niuke;

import java.util.ArrayList;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Array_reOrder {
    public void reOrder(int[] array){
        //思路：数组中的所有奇数提取出来，之后在合并,利用ArrayList（最傻的方法）
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();
        int l = array.length;
        for(int i = 0; i < l; i++){
            if(array[i] % 2 != 0)
                a1.add(array[i]);
            else
                a2.add(array[i]);
        }
        a1.addAll(a2);
        for(int i = 0; i<a1.size(); i++){
            array[i] = (int)a1.get(i);
        }
    }

    public static void main(String[] args) {
        Array_reOrder ar = new Array_reOrder();
        int[] array = {2,3,5,6,3,6,3,4,8,3};
        ar.reOrder(array);
        for (int i = 0; i< array.length; i++)
            System.out.println(i+":  "+array[i]);
    }
}
