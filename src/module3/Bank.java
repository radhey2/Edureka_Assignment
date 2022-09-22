package module3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account ac = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create A/c");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance");
            System.out.println("5. Exit");

            System.out.println("Enter the Option");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    if (ac == null) {
                        System.out.println("Enter a Account no");
                        String accNo = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter Name");
                        String name = sc.nextLine();
                        System.out.println("Enter Deposit Amount");
                        float amt = sc.nextFloat();

                        ac = new Account(name, accNo, amt);
                    } else {
                        System.out.println("Acount is already Created");

                    }

                    break;
                case 2:
                    if (ac != null) {
                        System.out.println("Enter Amount to Deposit");
                        float amount = sc.nextFloat();
                        ac.deposit(amount);
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;
                case 3:
                    if (ac != null) {
                        System.out.println("Enter Amount to Withdraw");
                        float amount = sc.nextFloat();
                        ac.withdraw(amount);
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;
                case 4:
                    if (ac != null) {
                        ac.getBalance();
                        System.out.println();
                    } else {
                        System.out.println("Create Account First");
                    }
                    break;
                default:
                    System.out.println("Bye Bye");
                    System.exit(0);

            }

        }
    }

}

class Account {
    String name;
    String accountNo;
    float bal;

    public Account(String name, String accountNo, float bal) {
        this.name = name;
        this.accountNo = accountNo;
        this.bal = bal;
        System.out.println("Account Created");
    }

    void deposit(float amount) {
        this.bal = amount + bal;
        System.out.println("Rs" + amount + "Deposited || Balance: " + this.bal);
    }

    void withdraw(float amount) {
        if (this.bal > amount) {
            this.bal -= amount;
            System.out.println("Rs :" + amount + "Debited || Balance");
        }

        else {
            System.out.println("Insufficient balance");
        }
    }

    void getBalance() {
        System.out.println("Name: " + this.name + "| A/No " + this.accountNo + "| Balance :" + this.bal);
    }
}
