import java.util.Scanner;

public class EmployeeIDManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] emp = new int[100];   // array to store employee IDs
        int size = 0;               // current number of employees
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter employee ID: ");
                    emp[size] = sc.nextInt();
                    size++;
                    System.out.println("Employee ID added.");
                    break;

                case 2: // Remove
                    if (size == 0) {
                        System.out.println("No employee IDs to remove.");
                        break;
                    }

                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    int pos = -1;

                    // Linear search
                    for (int i = 0; i < size; i++) {
                        if (emp[i] == removeId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("Employee ID not found.");
                    } else {
                        // Shifting
                        for (int i = pos; i < size - 1; i++) {
                            emp[i] = emp[i + 1];
                        }
                        size--;
                        System.out.println("Employee ID removed.");
                    }
                    break;

                case 3: // Display
                    if (size == 0) {
                        System.out.println("No employee IDs.");
                    } else {
                        System.out.println("\nEmployee IDs:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(emp[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
