package cn.com.cootoo;

/**
 * Created by zhaoxiang
 * Date 2020/3/11 3:22 下午
 * Description
 */
public class Mutest {


    public void merge2list(LNode l1,LNode l2){
        // 1-3-5-7-8
        // 2-4-6-8-10
        LNode pre=null;
        LNode cur=l1;

        if(l1.value<l2.value){

        }



    }

    class LNode{
        int value;
        LNode next;

        public LNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public LNode getNext() {
            return next;
        }

        public void setNext(LNode next) {
            this.next = next;
        }
    }
}
