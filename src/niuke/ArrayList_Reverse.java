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

    //输入一个链表，输出该链表中倒数第k个结点    0,1,2,3,4,5,6
    public ListNode find_K_FromTail(ListNode head, int k){
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

    //输入一个链表，反转链表后，输出新链表的表头。
    //方法一：利用栈（太占用内存空间，用例不通过）
    public ListNode reverseListNode(ListNode head){
        ListNode p = head;
        Stack stack = new Stack();
        if(head == null || head.next == null)
            return head;
        while (p != null){
            stack.push(p);
            p = p.next;
        }
        head = p = (ListNode) stack.pop();
        while(!stack.isEmpty()){
            p.next = (ListNode) stack.pop();
            p = p.next;
        }
        return head;
    }

    //输入一个链表，反转链表后，输出新链表的表头。
    //方法二：变换指针的指向
    public ListNode reverseListNode_2(ListNode head){
        ListNode pre = null;        //指向head的后一个
        ListNode next = null;       //指向head的前一个
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        //创建链表对象
        ListNode l3 = new ListNode(3,null);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ArrayList_Reverse ar = new ArrayList_Reverse();  //[1,2,3]
        //System.out.println(l1.val +" "+ l1.next.val);
        System.out.println(ar.printListFromTailToHead(l1));

        System.out.println(ar.find_K_FromTail(l3,1).val);

        System.out.println(ar.reverseListNode_2(l1).val);
    }
}
