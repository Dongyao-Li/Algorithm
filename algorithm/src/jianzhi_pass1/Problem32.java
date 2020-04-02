package jianzhi_pass1;

public class Problem32 {
    public static void main(String[] args) {
        Problem32 p = new Problem32();
        int[] arr = {1,2,3,4,5,6,7,0};
        int res = p.InversePairs(arr);
        System.out.print(res);
    }

    public int InversePairs(int [] arr) {
        if (arr.length == 0) return 0;
        return mergeSort(arr, 0, arr.length - 1)%1000000007;
    }

    public int mergeSort(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int mid = (l + r) >> 1;
        int left = mergeSort(arr, l, mid);
        int right = mergeSort(arr, mid + 1, r);
        int k = r, i = mid, j = r, count = 0;
        int[] tmp = new int[arr.length];
        while (i >= l && j >= mid + 1)
            if (arr[i] > arr[j]) {
                tmp[k -- ] = arr[i -- ];
                count += j - mid;
            } else tmp[k -- ] = arr[j -- ];
        while (i >= l) tmp[k -- ] = arr[i -- ];
        while (j >= mid + 1) tmp[k -- ] = arr[j -- ];
        for (i = r, j = r; i >= l; i -- , j -- ) arr[i] = tmp[j];
        return left + right + count;
    }
}
