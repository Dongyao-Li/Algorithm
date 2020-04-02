package jianzhi_pass1;

public class Problem01_1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if (row * col == 0) return false;
        int y = 0;
        int x = col-1;
        while (true) {
            if (x < 0 || y > row-1) return false;
            if (array[y][x] == target) return true;
            else if (target > array[y][x]) y++;
            else x--;
        }
    }

    public static void main(String[] args) {
        Problem01_1 p = new Problem01_1();
        //16,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean b = p.Find(16, arr);
        System.out.println(b);
    }
}
