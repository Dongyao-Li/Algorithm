package test;

public class MergeSort {

    final static int N = 1000010;

    public static void merge_sort(int[] arr, int l, int r) {
        if (arr.length < 2) return;
        if (l >= r) return;
        int mid = l + r >> 1;

        merge_sort(arr, l, mid);
        merge_sort(arr, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        int[] temp = new int[N];

        while (i <= mid && j <= r)
            if (arr[i] <= arr[j]) temp[k ++ ] = arr[i ++ ];
            else temp[k ++ ] = arr[j ++ ];
        while (i <= mid) temp[k ++ ] = arr[i ++ ];
        while (j <= r) temp[k ++ ] = arr[j ++ ];

        for (i = l, j = 0; i <= r; i ++ , j ++ ) arr[i] = temp[j];
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 1, 4, 3};
        merge_sort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i);
    }
}
