package Huawei;
import java.util.*;
public class Huawei2_3 {
    //背包算法求最优解（输入输出都是整数）
    //输入所有商品的价值，输入各价值对应的重量，限定背包容量
    //求解：在容量允许的条件下，求价值最大化

    public static void greedyPackage(int[] value, int[] weight, int capacity) {
        //性价比数组创建并排序
        int n = weight.length;//总个数

        //价值逆序排序
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (value[i] < value[j]) {
                    int tmp1 = value[i];
                    value[i] = value[j];
                    value[j] = tmp1;

                    //交换重量
                    int tmp2 = weight[i];
                    weight[i] = weight[j];
                    weight[j] = tmp2;
                }
            }
        }

        int maxValue = 0;
        //装东西，优先拿价值高的
        for (int i = 0; i < n; i++) {
            if (capacity > weight[i]) {
                capacity -= weight[i];
                maxValue += value[i];
            }
        }

        System.out.print(maxValue);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("宝贝价值：");  //6,3,5,4,6
        String a = sc.nextLine();

        String[] arr1 = a.split(",");
        int value[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            value[i]=Integer.parseInt(arr1[i]);
        }
        System.out.print("宝贝重量：");  //2,2,6,5,4
        String b = sc.nextLine();
        String[] arr2 = b.split(",");
        System.out.print("小偷背包容量：");  //10
        int capacity = sc.nextInt();
        int weight[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            weight[i]=Integer.parseInt(arr2[i]);
        }
        greedyPackage(value,weight,capacity);   //输出15
    }

//    public static void main(String[] args) {
//        int[] value = {6,3,5,4,6};
//        int[] weight = {2,2,6,5,4};
//        int capcity = 10;
//        greedyPackage(value,weight,capcity);
//        }
}
