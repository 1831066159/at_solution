package cn.com.cootoo.linkList;

/**
 * 合并两个有序链表
 * Created by zhaoxiang
 * Date 2020/2/28 11:22 上午
 * Description
 */
public class MergeTwoList {


    /**
     * 方法一： 递归
     * 1->3->5->7
     * 2->4->6->8
     *
     * @return
     */
    public static ListNode merge2List(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.getValue() < l2.getValue()) {
            l1.setNext(merge2List(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(merge2List(l1, l2.getNext()));
            return l2;
        }
    }


    /**
     * 方法二： 迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode merge2List2(ListNode l1, ListNode l2) {

        // 定义新链表的头节点
        ListNode head = new ListNode(-1);
        // 定义中间变量，记录当前节点
        ListNode current = head;


        while (l1 != null && l2 != null) {
            if (l1.getValue() < l2.getValue()) {
                // 如果 l1.val<l2.val, 将l1 添加到新链表
                current.setNext(l1);
                // l1链表下移到另一节点
                l1 = l1.getNext();
            } else {
                // 如果 l1.val>l2.val,  将l2 添加到新链表
                current.setNext(l2);
                // l2链表下移到另一节点
                l2 = l2.getNext();
            }
            // 当前操作下移
            current = current.getNext();
        }
        // 当其中一个链表迭代完成，另一个未迭代完的链表添加到新链表尾部
        current.setNext(l1 == null ? l2 : l1);
        return head.getNext();
    }


}
