import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Circle
                double r = sc.nextDouble();
                System.out.println(3.14 * r * r);
                break;

            case 2: // Square
                double side = sc.nextDouble();
                System.out.println(side * side);
                break;

            case 3: // Rectangle
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(l * b);
                break;

            case 4: // Triangle
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println(0.5 * base * height);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}