import java.util.Scanner;

class BankingSystem
{
    // Global Variable
    static float balance;
    static Scanner sc = new Scanner(System.in);

    // Functions
    static void inputBalance()
    {
        System.out.print("Enter initial balance: ");
        balance = sc.nextFloat();
    }

    static void deposit()
    {
        float amount;
        System.out.print("Enter deposit amount: ");
        amount = sc.nextFloat();

        balance = balance + amount;
        System.out.println("Updated Balance = " + balance);
    }

    static void withdraw()
    {
        float amount;
        System.out.print("Enter withdraw amount: ");
        amount = sc.nextFloat();

        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance = " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    static void displayBalance()
    {
        System.out.println("Current Balance = " + balance);
    }

    public static void main(String args[])
    {
        int choice;

        inputBalance();   // input only once

        do
        {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: deposit(); break;
                case 2: withdraw(); break;
                case 3: displayBalance(); break;
                case 4: System.out.println("Thank You"); break;
                default: System.out.println("Invalid choice");
            }
        }
        while(choice != 4);
    }
}
