import java.util.Scanner;

abstract class Shape {
    double value;

    Shape(double value) {
        this.value = value;
    }

    abstract void calculateArea();
}

class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    void calculateArea() {
        System.out.println("Area of Circle: " + (3.14 * value * value));
    }
}

class Square extends Shape {

    Square(double side) {
        super(side);
    }

    void calculateArea() {
        System.out.println("Area of Square: " + (value * value));
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Area Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Shape c = new Circle(r);
                    c.calculateArea();
                    break;

                case 2:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    Shape sq = new Square(s);
                    sq.calculateArea();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
