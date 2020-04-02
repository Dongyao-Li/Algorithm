package jianzhi_pass1;

public class Problem01 {
    public boolean Find(int target, int [][] array) {
        int Nrow = array.length;
        int Ncol = array[0].length;
        if (Nrow == 0 || Ncol == 0) return false;
        for (int i=0; i<Nrow; i++) {
            int loc = binSearch(target, 0, Ncol-1, array[i]);
            if (array[i][loc] == target) return true;
        }
        return false;
    }

    public int binSearch(int tar, int low, int high, int[] arr) {
        int mid = (low + high)/2;
        if (arr.length==0) return -1;
        else if (low == high) return low;
        else if(tar < arr[mid]) return binSearch(tar, low, mid-1, arr);
        else return binSearch(tar, mid+1, high, arr);
    }

    public static void main(String[] args) {
        Problem01 p = new Problem01();
        int[][] arr = {{1,2,3},{5,6,7},{8,9,10}};
        boolean b = p.Find(5, arr);
        System.out.println(b);
    }
}
