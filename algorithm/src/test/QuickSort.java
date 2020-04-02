package test;

public class QuickSort {
    public static void q_sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int x = arr[(l + r + 1) / 2], i = l - 1, j = r + 1;
        while (i < j) {
            do i ++ ; while (arr[i] < x);
            do j -- ; while (arr[j] > x);
            if (i < j) swap(arr, i ,j);
        }
        q_sort(arr, l, i - 1);
        q_sort(arr, i, r);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,2,4,6};
        q_sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
