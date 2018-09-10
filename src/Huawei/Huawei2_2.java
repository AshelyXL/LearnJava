package Huawei;
import java.util.*;
public class Huawei2_2 {
    //利用性价比求解背包算法的最优解（犹浮点数）
    public static void greedyPackage(int[] value, int[] weight, int capacity) {
        //性价比数组创建并排序
        int n = weight.length;//总个数
        double[] price = new double[n];//性价比数组
        int count[] = new int[n];//序号数组
        //求性价比
        for (int i = 0; i < n; i++) {
            price[i] = (double) value[i] / weight[i];
            count[i] = i;
        }

        //性价比排序
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (price[j] < price[j + 1]) {
                    double tmp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = tmp;
                    //交换性价比排序后，再吧序号交换,方便之后取数
                    int a = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = a;
                }
            }
        }

        //把质量和价值也按照性价比的排序顺序对应好，存到新数组里
        int newWeight[] = new int[n];
        int newValue[] = new int[n];
        for (int i = 0; i < n; i++) {
            newValue[i] = value[count[i]];
            newWeight[i] = weight[count[i]];
        }

        double maxValue = 0;
        //装东西，优先拿性价比高的
        for (int i = 0; i < n; i++) {
            if (capacity > newWeight[i]) {
                capacity -= newWeight[i];
                maxValue += newValue[i];
            }
        }

        //System.out.print("共放下了" + (max_weight - capacity) + "kg重的东西\n");
        System.out.print((int)maxValue);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.print("宝贝价值：");
        String a = sc.nextLine();

        String[] arr1 = a.split(",");
        int value[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            value[i]=Integer.parseInt(arr1[i]);
        }
        //System.out.print("宝贝重量：");
        String b = sc.nextLine();
        String[] arr2 = b.split(",");
        //System.out.print("小偷背包容量：");
        int capacity = sc.nextInt();
        int weight[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            weight[i]=Integer.parseInt(arr2[i]);
        }
        greedyPackage(value,weight,capacity);
    }

//    public static void main(String[] args) {
////        int[] value = {6,3,5,4,6};
////        int[] weight = {2,2,6,5,4};
////        int capcity = 10;
////        greedyPackage(value,weight,capcity);
//        }
    }
