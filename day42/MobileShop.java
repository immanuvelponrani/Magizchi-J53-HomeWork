import java.util.Scanner;

class Node {
    int id;
    String brand;
    double price;
    Node next;

    Node(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.next = null;
    }
}

class MobileShop {
    Node head = null;

    // Insert at Head
    void insertAtHead(int id, String brand, double price) {
        Node newNode = new Node(id, brand, price);
        newNode.next = head;
        head = newNode;
    }

    // Insert at Tail
    void insertAtTail(int id, String brand, double price) {
        Node newNode = new Node(id, brand, price);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Display
    void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("No Mobiles Available");
            return;
        }

        while (temp != null) {
            System.out.println(
                temp.id + " | " +
                temp.brand + " | ₹" +
                temp.price
            );
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobileShop shop = new MobileShop();
        int choice;

        do {
            System.out.println("\n===== Mobile Shop Menu =====");
            System.out.println("1. Add Latest Launch");
            System.out.println("2. Add Regular Stock");
            System.out.println("3. Display Mobiles");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        shop.insertAtHead(id, brand, price);
                    else
                        shop.insertAtTail(id, brand, price);
                    break;

                case 3:
                    shop.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}
