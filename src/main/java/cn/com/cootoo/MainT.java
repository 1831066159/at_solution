package cn.com.cootoo;

/**
 * Created by zhaoxiang
 * Date 2020/3/12 2:56 下午
 * Description
 */
public class MainT {


    public static void main(String[] args) {

        // 最小连续子数组和最大
        // 2,8，-7，4，2，12，-5，1，8，-3，6
        int[] arr = {2, 8, -7, 4, 2, 12, -5, 1, 8, -3, 6};

    }

    public int mmax(int[] arr){
        int max=0;
        int flag=0;

        for(int i:arr){
            max+=i;
            if(max>0){
                max+=i;
            }

        }

        return 1;
    }

}
