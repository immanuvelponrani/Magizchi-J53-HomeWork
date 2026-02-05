import java.util.Scanner;

public class TransportSystem {

    static Scanner sc = new Scanner(System.in);

    static void selectRoute(Transport t) {

        System.out.println("\nSelect Route:");
        System.out.println("1. Chennai -> Bangalore (350 km)");
        System.out.println("2. Chennai -> Coimbatore (500 km)");
        System.out.println("3. Chennai -> Madurai (460 km)");
        System.out.println("4. Chennai -> Trichy (330 km)");
        System.out.println("5. Chennai -> Salem (340 km)");

        int r = sc.nextInt();

        switch(r) {
            case 1: t.toCity="Bangalore"; t.distance=350; break;
            case 2: t.toCity="Coimbatore"; t.distance=500; break;
            case 3: t.toCity="Madurai"; t.distance=460; break;
            case 4: t.toCity="Trichy"; t.distance=330; break;
            case 5: t.toCity="Salem"; t.distance=340; break;
            default: System.out.println("Invalid Route");
        }
    }

    public static void main(String[] args) {

        int choice;

        CityBus cb = null;
        LuxuryBus lb = null;

        do {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    cb = new CityBus();

                    System.out.print("Enter Passenger ID: ");
                    cb.passengerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    cb.passengerName = sc.nextLine();

                    selectRoute(cb);
                    System.out.println("City Bus Ticket Booked");
                    break;

                case 2:
                    lb = new LuxuryBus();

                    System.out.print("Enter Passenger ID: ");
                    lb.passengerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    lb.passengerName = sc.nextLine();

                    selectRoute(lb);
                    System.out.println("Luxury Bus Ticket Booked");
                    break;

                case 3:
                    if(cb != null) {
                        cb.calculateFare();
                        System.out.println("City Bus Fare Calculated");
                    }
                    if(lb != null) {
                        lb.calculateFare();
                        System.out.println("Luxury Bus Fare Calculated");
                    }
                    break;

                case 4:
                    if(cb != null) cb.displayTicket();
                    if(lb != null) lb.displayTicket();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);
    }
}
