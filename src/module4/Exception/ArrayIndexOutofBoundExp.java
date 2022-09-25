package module4.Exception;

public class ArrayIndexOutofBoundExp {
    public static void main(String[] args) {
        indexOutofBound();
    }

    public static void indexOutofBound() {
        int[] arr = { 1, 2, 45, 67, 56, 200 };
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
