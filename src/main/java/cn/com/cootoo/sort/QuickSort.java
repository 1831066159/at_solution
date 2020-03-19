package cn.com.cootoo.sort;

import java.util.Stack;

/**
 * 快排
 * Created by mm
 * Date 2020/2/27 11:18 上午
 * Description
 */
public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {94, 6, 93, 143, 124, 55, 23, 191, 89, 299};

        quicks(arr, 0, arr.length - 1);

        Stack s= new Stack();
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int beign, int end) {
        if (beign >= end) {
            return;
        }

        int mid = partiton(arr, beign, end);

        quickSort(arr, beign, mid - 1);
        quickSort(arr, mid + 1, end);

    }


    private static int partiton(int[] arr, int beign, int end) {
        int mark = beign;
        int mid = arr[beign];

        for (int i = beign + 1; i <= end; i++) {
            if (arr[i] < mid) {
                mark++;
                int tmp = arr[i];
                arr[i] = arr[mark];
                arr[mark] = tmp;
                System.out.println("i="+i+",mark="+mark+",arr[i]="+arr[i]+",arr[mark]="+arr[mark]);
            }
        }
        // 将找到的中间
        arr[beign] = arr[mark];
        arr[mark] = mid;
        return mark;
    }



    // 8,3,5,6,12,32,1
    private static void quicks(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int mid = part(arr, begin, end);
        quicks(arr, 0, mid-1);
        quicks(arr, mid + 1, end);
    }

    private static int part(int[] arr, int begin, int end) {
        int mark = begin;
        int mid = arr[begin];
        for (int i = begin + 1; i <= end; i++) {
            if (arr[i] < mid) {
                mark += 1;
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
