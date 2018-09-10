package niuke;
import java.util.ArrayList;
import java.util.Stack;

//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList

//定义链表节点类：包含val和next属性
class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

public class ArrayList_Reverse {
    //定义方法：从尾到头输出
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        //返回ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        //创建链表对象
        ListNode l3 = new ListNode(3,null);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ArrayList_Reverse ar = new ArrayList_Reverse();
        //System.out.println(l1.val +" "+ l1.next.val);
        System.out.println(ar.printListFromTailToHead(l1));
    }
}
