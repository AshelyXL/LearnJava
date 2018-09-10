package niuke;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
    StringBuffer s = new StringBuffer();  //StringBuffer一定要创建实例化对象
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')    //获取字符串中的单个字符
                s.append("%20");
            else s.append(str.charAt(i));
        }
        return s.toString();
        //法二：
        //return str.toString().replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("nihao zaijan heheda");
        ReplaceSpace re = new ReplaceSpace();
        System.out.println(re.replaceSpace(str));
    }

}
