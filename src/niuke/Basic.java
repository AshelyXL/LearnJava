package niuke;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        //创建数组，必须指定数组长度
        int[] a = new int[5];
        a[4] = 67;
        System.out.println(a[4]);

        //直接初始化数组
        int[] a_2 = {1,2,2,3,3,3};

        //Array-->合并到-->List,
        //先用Arrays.asList将数组转化成list,再调用list的方法：addAll
        Integer[] b = {0,1,2,3,4,5};
        List l = new ArrayList();
        //List是接口，无法创建对象，因此需要使用其他类，如ArrayList
        //List集合是对象的集合
        l.add(2);
        l.add(0,13);

        //Arrays.asList对基本类型支持不好，所以前面使用的是Integer定义的数组b
        System.out.println(l);  //[13, 2]
        l.addAll(Arrays.asList(b));
        System.out.println(l);      //[13, 2, 0, 1, 2, 3, 4, 5]

        //List-->合并到-->Array


    }
}
