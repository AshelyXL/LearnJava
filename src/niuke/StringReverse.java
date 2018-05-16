package niuke;

public class StringReverse {

    public String reverse2(String str) {
        if(str.trim().equals(""))  //trim去除字符串首尾空格
            return str;            //注意这里用equals，表示比较的是值
        //空串直接返回对应的空串，此时不考虑null，因为null不分配内存，相当于没有输入
        String[] s = str.split(" "); //spilt根据空格分隔，并将拆分的词保存在字符串数组中
        StringBuffer sb = new StringBuffer(); //StringBuffer类的对象能够进行多次修改并且不会产生新的未使用的对象
        for (int i = s.length - 1; i >= 0; i--)
            sb.append(s[i] + " ");  //append实现在串后添加内容
        return sb.toString().trim();  //toString使得sb转换成string类型，trim保证去除最后多出的一个空格
    }

    public static void main(String[] args) {
        StringReverse re = new StringReverse();   //实例化对象
        String st = re.reverse2("I am a student");  //返回string类型，保存在st中
        System.out.println(st);
    }

}

