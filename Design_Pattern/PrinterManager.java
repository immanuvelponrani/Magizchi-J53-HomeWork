class PrinterManager {

    private static PrinterManager instance;

    // Private constructor
    private PrinterManager() {}

    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    void print() {
        System.out.println("Printing document...");
    }
}

public class Main {
    public static void main(String[] args) {

        PrinterManager p1 = PrinterManager.getInstance();
        PrinterManager p2 = PrinterManager.getInstance();

        p1.print();
        p2.print();

        System.out.println(p1 == p2); // true
    }
}
