import java.util.Scanner;

class CountNumbers
{
    static int a[] = new int[10];
    static Scanner sc = new Scanner(System.in);

    static void enterNumbers()
    {
        for(int i = 0; i < 10; i++)
            a[i] = sc.nextInt();
    }

    static void displayNumbers()
    {
        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void countPositive()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(a[i] > 0)
                count++;
        System.out.println(count);
    }

    static void countNegative()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(a[i] < 0)
                count++;
        System.out.println(count);
    }

    static void countZero()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(a[i] == 0)
                count++;
        System.out.println(count);
    }

    public static void main(String args[])
    {
        int choice;

        do
        {
            System.out.println("1.Enter Numbers");
            System.out.println("2.Display Numbers");
            System.out.println("3.Count Positive");
            System.out.println("4.Count Negative");
            System.out.println("5.Count Zero");
            System.out.println("6.Exit");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    enterNumbers();
                    break;
                case 2:
                    displayNumbers();
                    break;
                case 3:
                    countPositive();
                    break;
                case 4:
                    countNegative();
                    break;
                case 5:
                    countZero();
                    break;
            }
        }
        while(choice != 6);
    }
}
