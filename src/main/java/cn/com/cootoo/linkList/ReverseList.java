package cn.com.cootoo.linkList;

/**
 * 单链表反转
 * Created by mm
 * Date 2020/2/27 2:59 下午
 * Description
 */
public class ReverseList {


    /**
     * 我们可以申请两个指针，第一个指针叫 pre，最初是指向 null 的。
     * 第二个指针 cur 指向 head，然后不断遍历 cur。
     * 每次迭代到 cur，都将 cur 的 next 指向 pre，然后 pre 和 cur 前进一位。
     * 都迭代完了(cur 变成 null 了)，pre 就是最后一个节点了。
     *
     * @param head
     * @return
     */
    public static Node reverseListNode(Node head) {
        //单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null) {
            return head;
        }
        //前一个节点指针
        Node preNode = null;
        //当前节点指针
        Node curNode = head;
        //下一个节点指针
        Node nextNode = null;

        while (curNode != null) {
            nextNode = curNode.getNext();//nextNode 指向下一个节点
            curNode.setNext(preNode);//将当前节点next域指向前一个节点
            preNode = curNode;//preNode 指针向后移动
            curNode = nextNode;//curNode指针向后移动
        }
        return preNode;
    }


    class Node {
        private Object value;
        private Node next;

        public Node() {
        }

        public Node(Object value) {
            this.value = value;
        }

        public Node(Object value, ReverseList.Node next) {
            this.value = value;
            this.next = next;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public ReverseList.Node getNext() {
            return next;
        }

        public void setNext(ReverseList.Node next) {
            this.next = next;
        }
    }

}
