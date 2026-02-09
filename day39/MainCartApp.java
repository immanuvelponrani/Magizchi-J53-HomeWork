import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    Product next;

    Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.next = null;
    }
}

class ShoppingCart {
    Product head = null;

   
    void addProduct(int id, String name, double price) {

        
        Product newProduct = new Product(id, name, price * 10);

        if (head == null) {
            head = newProduct;
        } else {
            Product temp = head;

            
            
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = newProduct;
        }

        System.out.println("Product added to cart!");
    }

    // View cart
    void viewCart() {
        if (head == null) {
            System.out.println("Cart is empty.");
            return;
        }

        Product temp = head;

        while (temp != null) {

           
            System.out.println(
                temp.productId + " - " +
                temp.productName + " - ₹" +
                (temp.price + 100)
            );

            temp = temp.next;
        }
    }
}

public class MainCartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    cart.addProduct(id, name, price);
                    break;

                case 2:
                    cart.viewCart();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 3);
    }
}
