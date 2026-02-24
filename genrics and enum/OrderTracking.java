import java.util.Scanner;

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class OrderTracking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Order Menu ---");
            System.out.println("1. Show Order Status");
            System.out.println("2. Check if Completed");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (OrderStatus o : OrderStatus.values())
                        System.out.println(o);
                    break;

                case 2:
                    System.out.print("Enter Status: ");
                    OrderStatus st =
                        OrderStatus.valueOf(sc.next().toUpperCase());

                    if (st == OrderStatus.DELIVERED)
                        System.out.println("Order Completed ✅");
                    else
                        System.out.println("Order Not Completed ❌");
                    break;

                case 3:
                    System.out.println("Exit...");
                    break;
            }

        } while (choice != 3);
    }
}
