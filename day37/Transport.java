abstract class Transport {

    int passengerId;
    String passengerName;
    String fromCity = "Chennai";
    String toCity;
    double distance;
    double fare;

    abstract void calculateFare();

    void displayTicket() {
        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger ID   : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Route          : " + fromCity + " -> " + toCity);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + fare);
    }
}
