package com.algorithm;

import org.junit.jupiter.api.Test;

/**
 * @Descripttion 俩数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Ming
 * @Date 2020/5/31
 */
public class AddTwoNumbers {


    @Test
    public void test() {
        ListNode  t = new ListNode(1);
        for (int i = 0; i < 5; i++) {
            addListNode(t, new ListNode(i));
        }
        printListNode(t);
    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode m = l1,n = l2,tmp = new ListNode(l1.val);
        //进位
        int carry = 0;
        while(m.next != null || n.next !=null){
            tmp.val = m.val + n.val;


        }

        return null;
    }

    /**
     * @Descripttion 从尾节点插入链表
     * @Author Ming
     * @Date 2020/5/31
     * @param: p
     * @param: m
     */
    public static void addListNode(ListNode p, ListNode m){

        ListNode tmp = p;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = m;
    }

    /**
     * @Descripttion 打印链表
     * @Author Ming
     * @Date 2020/5/31
     * @param: listNode
     */
    public static void printListNode(ListNode listNode){

        ListNode tmp = listNode;
        while (tmp != null){
            // 当前节点的值
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    /**
     * @Descripttion 链表
     * @Author Ming
     * @Date 2020/5/31
     */
    class ListNode {
        int val;
        /**
         * @Descripttion 下一个链表对象
         * @Author Ming
         * @Date 2020/5/31
         */
        ListNode next;
        /**
         * @Descripttion 赋值链表的值
         * @Author Ming
         * @Date 2020/5/31
         * @param: x
         */
        ListNode(int x) { val = x; }
    }
}
