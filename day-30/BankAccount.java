import java.util.Scanner;

class BankAccount {
    int balance = 1000;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        int choice;

        do {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display balance");
            System.out.println("4.Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int amt = sc.nextInt();
                    acc.deposit(amt);
                    break;

                case 2:
                    int w = sc.nextInt();
                    acc.withdraw(w);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
