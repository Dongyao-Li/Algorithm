package jianzhi_pass1;
import java.util.ArrayList;
public class Problem19 {

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        int len = (row < col) ? row : col;
        for (int i = 0; i < (len + 1) / 2; i ++ ) {
            ArrayList<Integer> tmp = printOutline(matrix, i);
            for (int j = 0; j < tmp.size(); j ++ ) res.add(tmp.get(j));
        }
        return res;
    }

    public static ArrayList<Integer> printOutline(int[][] m, int lay) {
        ArrayList<Integer> res = new ArrayList<>();
        if (m[0].length == 0 && m.length == 0) return res;
        int row = m.length, col = m[0].length;
        int len = (row < col) ? row : col;
        if (lay >= (len + 1) / 2) return res;
        for (int i = lay; i < col - lay; i ++ )
            res.add(m[lay][i]);
        for (int i = lay + 1; i < row - lay; i ++ )
            res.add(m[i][col - lay - 1]);
        for (int i = col - lay - 2; i >= lay; i -- )
            res.add(m[row - lay - 1][i]);
        for (int i = row - lay - 2; i > lay; i -- )
            res.add(m[i][col - lay - 1]);
        return res;
    }

    public static void main(String[] args) {
        int[][] m = {{1}, {2}, {3}, {4}};
        ArrayList<Integer> ans = printMatrix(m);
        for (int i = 0; i < ans.size(); i ++ ) System.out.print(ans.get(i));
    }

}
