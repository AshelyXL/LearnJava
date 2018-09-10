package niuke;
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
//假设输入的前序遍历pre和中序遍历in的结果中都不含重复的数字

import java.util.HashMap;

//定义树结构的节点类
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int val){
        this.val = val;
    }
}

public class BiniaryTree_Rebuild {
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历pre={1,2,4,7,3,5,6,8}和中序遍历序列in={4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn) {
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);
        //检查中序数组in中的各个变量
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+(i-startIn),in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,startPre+(i-startIn)+1,endPre,in,i+1,endIn);
        }
        return root;
    }

    public static void main(String[] args) {
        BiniaryTree_Rebuild br = new BiniaryTree_Rebuild();
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in  = {4,7,2,1,5,3,8,6};
        TreeNode tree = br.reConstructBinaryTree(pre,in);
    }
}


