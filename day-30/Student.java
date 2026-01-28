import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void addStudent(String n, int r) {
        name = n;
        rollNo = r;
        System.out.println("Student details saved");
    }

    void updateName(String n) {
        name = n;
        System.out.println("Student name updated");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        do {
            System.out.println("1.Add student details");
            System.out.println("2.Update student name");
            System.out.println("3.Display student details");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    String name = sc.nextLine();
                    int roll = sc.nextInt();
                    s.addStudent(name, roll);
                    break;

                case 2:
                    String newName = sc.nextLine();
                    s.updateName(newName);
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
