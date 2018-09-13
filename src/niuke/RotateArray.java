package niuke;
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
//例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//{2,2,3,4,1}

import java.util.Arrays;

public class RotateArray {
    public int minNumber_RotateArray(int[] array) {
        if(array.length == 0)
            return 0;
        if(array.length == 1)
            return array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[0])
                return array[i];
        }
        return array[0];
    }

        public static void main(String[] args) {
            int[] arr = {4, 4, 5, 6, 1, 2, 3};
            RotateArray ra = new RotateArray();
            System.out.println(ra.minNumber_RotateArray(arr));
        }
    }

