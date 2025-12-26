import java.util.Scanner;

public class RailwayTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println("General - Rs.150");
                break;
            case 2:
                System.out.println("Sleeper - Rs.300");
                break;
            case 3:
                System.out.println("AC 3 Tier - Rs.700");
                break;
            case 4:
                System.out.println("AC 2 Tier - Rs.1000");
                break;
            case 5:
                System.out.println("First Class - Rs.1500");
                break;
            default:
                System.out.println("Invalid seat type");
        }
    }
}