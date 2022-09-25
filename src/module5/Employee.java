package module5;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.EmployeeData();
    }

    public void EmployeeData() {
        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1, "Radhey");
        m1.put(2, "Shubham");
        m1.put(3, "jai");
        m1.put(4, "Priya");
        m1.put(5, "Kumud");

        System.out.println(m1);
    }
}
