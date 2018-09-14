package niuke;
import java.util.ArrayList;
import java.util.Stack;

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

    //输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
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

    public ListNode find_K_FromTail(ListNode head, int k){
        //输入一个链表，输出该链表中倒数第k个结点    0,1,2,3,4,5,6
        if(head == null )
            return head;
        ListNode p,q;
        p = q  = head;
        int i = 0;
        while (p.next != null){
            p = p.next;
            i++;
        }
        if(k > i+1)         //{2,5,7,9}  4
            return null;
        for(int j = 0; j < i+1-k; j++){     //{1}  0
            q = q.next;
        }
        return q;
    }

    public static void main(String[] args) {
        //创建链表对象
        ListNode l3 = new ListNode(3,null);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ArrayList_Reverse ar = new ArrayList_Reverse();
        //System.out.println(l1.val +" "+ l1.next.val);
        System.out.println(ar.printListFromTailToHead(l1));

        System.out.println(ar.find_K_FromTail(l1,3).val);
    }
}
