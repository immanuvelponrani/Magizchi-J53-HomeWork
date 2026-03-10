import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagement {

    static Employee[] emp = new Employee[100];
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n---- Employee Menu ----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    emp[count++] = new Employee(id, name, dept);

                    System.out.println("Employee Added!");
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        emp[i].display();
                        System.out.println("------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (emp[i].id == searchId) {
                            emp[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found");

                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 4);
    }
}
