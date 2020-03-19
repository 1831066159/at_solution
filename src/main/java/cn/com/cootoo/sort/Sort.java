package cn.com.cootoo.sort;

/**
 * Created by zhaoxiang
 * Date 2020/2/28 9:03 上午
 * Description
 */
public class Sort {

    public static void main(String[] args) {

        int[] arr = {66, 44, 5, 89, 65, 6, 89, 94, 132, 88, 34};
        quickSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.println(a);
        }
    }


    private static void quickSort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int mid = parttion(arr, begin, end);
        quickSort(arr, begin, mid - 1);
        quickSort(arr, mid + 1, end);
    }

    private static int parttion(int[] arr, int begin, int end) {
        int mid = arr[begin];
        int mark = begin;

        for (int i = begin + 1; i <= end; i++) {
            if (arr[i] < mid) {
                mark++;
                int tmp = arr[i];
                arr[i] = arr[mark];
                arr[mark] = tmp;
            }
        }
        arr[begin] = arr[mark];
        arr[mark] = mid;
        return mark;
    }

}
