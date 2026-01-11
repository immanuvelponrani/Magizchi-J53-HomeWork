import java.util.Scanner;

class ArrayReverse
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

    static void displayReverse()
    {
        for(int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int choice;

        do
        {
            System.out.println("1.Enter Numbers");
            System.out.println("2.Display Numbers");
            System.out.println("3.Display Reverse");
            System.out.println("4.Exit");
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
                    displayReverse();
                    break;
            }
        }
        while(choice != 4);
    }
}
