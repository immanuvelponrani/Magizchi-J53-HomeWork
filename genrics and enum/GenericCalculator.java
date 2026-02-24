import java.util.Scanner;

class Calculator<T extends Number> {

    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}

public class GenericCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator<Number> calc = new Calculator<>();
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 3) break;

            System.out.print("Enter first number: ");
            Number a = sc.nextDouble();

            System.out.print("Enter second number: ");
            Number b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(a, b));
                    break;

                case 2:
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;
            }

        } while (choice != 3);
    }
}
