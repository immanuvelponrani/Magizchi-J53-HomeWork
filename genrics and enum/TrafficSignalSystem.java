import java.util.Scanner;

enum Signal {
    RED, YELLOW, GREEN
}

public class TrafficSignalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Traffic Signal Menu ---");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Signal s : Signal.values()) {
                        switch (s) {
                            case RED:
                                System.out.println("RED → Stop");
                                break;
                            case YELLOW:
                                System.out.println("YELLOW → Get Ready");
                                break;
                            case GREEN:
                                System.out.println("GREEN → Go");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Signal (RED/YELLOW/GREEN): ");
                    Signal sig = Signal.valueOf(sc.next().toUpperCase());

                    if (sig == Signal.GREEN)
                        System.out.println("Go 🚗");
                    else
                        System.out.println("Stop ✋");
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 3);
    }
}
