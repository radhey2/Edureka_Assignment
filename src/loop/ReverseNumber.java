package loop;

public class ReverseNumber {
    public static void main(String[] args) {

        numReverse(1234);
        System.out.println();
        ReverseNumber.numReverse(4321);
        System.out.println();
        ReverseNumberDo.numReverseDowhile(5678);

    }

    static void numReverse(int num) {

        for (int i = 0; i < 4; i++) {
            int rem = num % 10;
            int rev = +rem;
            num = num / 10;
            System.out.print(rev);
        }
    }

}

class ReverseNumber1 {
    static void numWhilereverse(int number) {
        int reverse = 0;
        while (number == reverse) {
            int remender = number % 10;
            reverse = +remender;
            number = number / 10;
            System.out.print(reverse);
        }
    }

}

class ReverseNumberDo {
    static void numReverseDowhile(int number1) {
        int reverse1 = 0;
        do {
            int remender = number1 % 10;
            reverse1 = +remender;
            number1 = number1 / 10;
            System.out.print(reverse1);
        } while (number1 != reverse1);
    }
}
