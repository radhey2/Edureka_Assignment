package if_conditions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        EvenOdd();
    }

    static void EvenOdd(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            int num2 = sc.nextInt();
             
            if (num1 % 2 == 0){
                System.out.println("num is Even : " +num1);
            }
            else{
                System.out.print("num is Odd : " +num2);
            }
        }
    }
}
