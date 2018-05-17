package niuke;

public class Array2DFind {
    //从左到右从上到下递增的二维数组，查找某元素是否在其中
    //思路：利用数组的有序性，选择从右上角或者左下角进行查找
    public boolean Find(int target, int[][] array) {   //array[row][col]
        int row = array.length - 1;    //获得行数，左下角开始
        int col = 0;
        while (row >= 0 && col < array[0].length) {
            if (target == array[row][col]) {
                return true;
            }
            else if (target < array[row][col])
                row--;
            else
                col++;
        }
        return false;
    }

    public static void main(String[] args) {
        int array[][] = {{1, 4, 7, 9}, {2, 7, 8, 11}, {4, 8, 12, 19}};
        int[] t ={1, 7, 19, 3, 35};
        Array2DFind f = new Array2DFind();
        for(int i = 0; i < t.length; i++){
            System.out.println(t[i] + " : " + f.Find(t[i], array));
        }
    }
}

