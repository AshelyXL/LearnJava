package niuke;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
//一级台阶：1种；
//二级台阶：2种；
//三级台阶：1+2=3  （从一级台阶条2步，从二级台阶跳1步）
//四级台阶：2+3=5
public class JumpFloor {
    //一次可以跳上1级台阶，也可以跳上2级
    public int jump(int target){
        if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else
            return (jump(target-2) + jump(target-1));
    }

    //如果：一次可以跳上1级台阶，也可以跳上2级，...还可以调n级台阶
    //转换解题思路：每个台阶都有跳与不跳两种情况（除了最后一个台阶）
    // 最后一个台阶必须跳，所以，跳法由前n-1个台阶确定
    // 共用2^(n-1)中情况
    public int multiJump(int target){
        return (int)Math.pow(2,(target-1));
    }

    //类似题：请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
    // 总共有多少种方法？
    //target = 0,  0
    //target = 1,  1   |
    //target = 2,  2   =
    //target = 3,  3   |=, =|, |||
    //target = 4,  5   =|=, ==/, =|||, |==, =|=, |||=
    public int rectCover(int target){
        if(target == 0)
            return 0;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else
            return(rectCover(target-1)+rectCover(target-2));
    }
}
