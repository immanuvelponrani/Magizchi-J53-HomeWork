import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekdaySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Day Menu ---");
            System.out.println("1. Check Working Day");
            System.out.println("2. Check Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Day: ");
                    Day d1 = Day.valueOf(sc.next().toUpperCase());

                    if (d1.ordinal() < 5)
                        System.out.println("Working Day");
                    else
                        System.out.println("Not Working Day");
                    break;

                case 2:
                    System.out.print("Enter Day: ");
                    Day d2 = Day.valueOf(sc.next().toUpperCase());

                    if (d2 == Day.SATURDAY || d2 == Day.SUNDAY)
                        System.out.println("Weekend 🎉");
                    else
                        System.out.println("Weekday");
                    break;

                case 3:
                    for (Day d : Day.values())
                        System.out.println(d);
                    break;

                case 4:
                    System.out.println("Exit...");
                    break;
            }

        } while (choice != 4);
    }
}
