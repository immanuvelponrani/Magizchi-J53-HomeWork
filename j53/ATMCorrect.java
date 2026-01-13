import java.util.Scanner;

class ATMCorrect
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double balance = 5000.75;
        float withdraw = sc.nextFloat();

        balance = balance - withdraw;

        System.out.println(balance);
    }
}
