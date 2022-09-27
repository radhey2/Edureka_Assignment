package module6;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student("101", "jhon", "10", "Male", "100", "Chandigarh");
        Student s2 = new Student("102", "Bill", "10", "Male", "90", "Chandigarh");
        System.out.println(s1);
        System.out.println(s2);

        ArrayList<Student> student = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);

    }
}
