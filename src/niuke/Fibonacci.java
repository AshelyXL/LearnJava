package niuke;
//输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//0,1,1,2,3,5,8,13,21,34,55,89,...
//n<=39
public class Fibonacci {
    public static int fib(int n){
        if(n ==0)
            return 0;
        else if (n ==1 || n ==2)
            return 1;
        else
            return (fib(n-2)+fib(n-1));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(6));  //8
    }
}
