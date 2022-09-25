package module5;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentMarks();
    }

    public void studentMarks() {
        Hashtable<String, Integer> h = new Hashtable<>();

        h.put("Jhon", 100);
        h.put("Harry", 99);
        h.put("Anju", 87);
        h.put("Radhey", 94);
        h.put("Ravi", 84);
        System.out.println(h.values());
        System.out.println(h);

        Integer max = (int) Double.MIN_VALUE;
        for (Object key : h.keySet()) {
            Integer tmp = h.get(key);
            if (tmp.compareTo(max) > 0) {
                max = tmp;
            }
        }

        System.out.println("Maximum Marks is : " + max);
    }
}
