package niuke;

import java.util.ArrayList;
import java.util.Stack;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Array_reOrder {
    public void reOrder(int[] array){
        //思路1：数组中的所有奇数提取出来，之后在合并,利用ArrayList（最傻的方法）
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

    public void reOrder_2(int[] array){
        //思路2：利用栈，奇数入栈，再偶数入栈，出栈放到数组中（从后往前放）
        Stack stack = new Stack();
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0)
                stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0)
                stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            array[array.length-1-i] = (int)stack.pop();
        }
    }

    public void reOrder_3(int[] array){
        //思路3：利用冒泡排序的思想，从前完后扫描，
        //每发现一个奇数，就往左换，直到紧邻前面一个奇数
        //好处：空间开销小，不需要额外定义其他数据结构（栈、列表等）
        int tmp = 0;    //2,4,5,6,3,6,7,4,8,9
        for (int i = 0; i < array.length; i++){      //遍历每个元素
            if(array[i] % 2 != 0){      //找奇数
                for (int j = i-1; j >= 0; j--){
                    if(array[j] % 2 == 0){         //2,5,4,6,3,6...   ou = 1
                        tmp = array[j+1];          //5,2,4,6,3,6         ou = 0
                        array[j+1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Array_reOrder ar = new Array_reOrder();
        int[] array = {2,4,5,6,3,6,7,4,8,9};
        ar.reOrder_3(array);
        for (int i = 0; i< array.length; i++)
            System.out.print(array[i]+"  ");
    }
}
