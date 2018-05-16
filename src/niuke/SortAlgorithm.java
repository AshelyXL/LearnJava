package niuke;

public class SortAlgorithm {

    public static int[] boubleSort(int[] a) { //冒泡排序：相邻两个比较，每次有一个归位
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] selectSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            //选择排序：每次选定一个元素，把它和其他比较,选择元素a[minIndex]
            int minIndex = i;
            for(int j = minIndex+1; j<n; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static int[] insertionSort(int[] a){
        int j;
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            for(j =i-1; j >= 0 && temp < a[j]; j-- ){
                a[j+1] = a[j];
            }
            a[j+1] = temp;
        }
        return a;
    }

    public static int[] quickSort(int[] a, int low, int high) throws Exception {

        int i, j, index;
        i = low;
        j = high;
        if (low > high) {
            return null;
        }
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        quickSort(a, low, i - 1); // 对低子表进行递归排序
        quickSort(a, i + 1, high); // 对高子表进行递归排序

        return a;
    }


    public static void main(String[] args) throws Exception{

        int[] a4 = {49,38,65,97,76,13,27,49};
        int[] arr4 = quickSort(a4,0, a4.length-1);
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }
        System.out.println("quickSort");

        int[] a1 = {49,38,65,97,76,13,27,49};
        int[] arr1 = boubleSort(a1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("boubleSort");


        int[] a2 = {49,38,65,97,76,13,27,49};
        int[] arr2 = selectSort(a2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("selectSort");


        int[] a3 = {49,38,65,97,76,13,27,49};
        int[] arr3 = insertionSort(a3);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println("insertionSort");



    }
}



