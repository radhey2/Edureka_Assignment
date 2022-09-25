package module4.calculation;

public class Calculation {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.subtract(15, 10);
        cal.add(15, 10);
        cal.divide(100, 20);
        cal.multiply(15, 15);
        cal.factorial(5);
        cal.numReverse(12345);
    }

    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction is " + c);
    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Add is " + c);
    }

    public void multiply(int a, int b) {
        int c = a + b;
        System.out.println("Multiplication is :" + c);
    }

    public void divide(int a, int b) {
        int c = a + b;
        System.out.println("Division is :" + c);
    }

    public void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial is " + fact);

    }

    public void numReverse(int num) {
        int rev = 0;
        for (int i = 0; i < 4; i++) {
            int rem = num % 10;
            rev = +rem;
            num = num / 10;
            System.out.print(rev);
        }

    }
}