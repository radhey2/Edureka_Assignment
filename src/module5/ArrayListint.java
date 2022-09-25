package module5;

import java.util.ArrayList;

public class ArrayListint {
    public static void main(String[] args) {
        ArrayListint store = new ArrayListint();
        store.storeData();

    }

    public void storeData() {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arr.add(i);

        }
        System.out.println(arr);
    }
}
