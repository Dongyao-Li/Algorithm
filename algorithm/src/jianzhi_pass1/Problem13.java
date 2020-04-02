package jianzhi_pass1;

public class Problem13 {

    public void reOrderArray(int [] array) {
        if (array.length < 2) return;
        for (int i = 1; i < array.length; i ++ ) {
            if (i == 0) i = 1;
            if (array[i] % 2 == 1 && array[i - 1] % 2 == 0) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i -= 2 ;
            }
        }
    }

    public static void main(String[] args) {
        Problem13 p = new Problem13();

        int[] arr2 = {2,4,6,1,3,5,7};
        p.reOrderArray(arr2);
        for (int a : arr2) System.out.print(a);
    }
}
