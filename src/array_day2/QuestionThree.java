package array_day2;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        String s[] = { "radhey", "ravi", "Ankush", "Shubham", "kumud" };
        String[] salary = { "2000", "30000", "60000", "1000", "50000" };

        employeeData(a, s, salary);
        System.out.println();
        employeeData(a, s);
        System.out.println();
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            if (name.equals(s[i])) {
                System.out.println(a[i] + " " + salary[i]);
            }
        }
        sc.close();
    }

    static void employeeData(int[] a, String[] s, String[] salary) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + s[i] + "   " + salary[i]);
        }

    }

    static void employeeData(int[] a, String[] s) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + s[i]);
        }

    }

}
