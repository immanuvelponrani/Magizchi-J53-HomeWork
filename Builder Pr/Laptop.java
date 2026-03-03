import java.util.Scanner;

class Laptop {

    private String brand;
    private String ram;
    private boolean ssd;
    private boolean graphics;
    private boolean warranty;
    private boolean msOffice;

    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphics = builder.graphics;
        this.warranty = builder.warranty;
        this.msOffice = builder.msOffice;
    }

    public void display() {
        System.out.println("------ Laptop Order Details ------");
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + ssd);
        System.out.println("Graphics Card: " + graphics);
        System.out.println("Extended Warranty: " + warranty);
        System.out.println("MS Office: " + msOffice);
    }

    public static class LaptopBuilder {

        private String brand;
        private String ram;
        private boolean ssd;
        private boolean graphics;
        private boolean warranty;
        private boolean msOffice;

        public LaptopBuilder(String brand, String ram) {
            this.brand = brand;
            this.ram = ram;
        }

        public LaptopBuilder setSSD(boolean ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setGraphics(boolean graphics) {
            this.graphics = graphics;
            return this;
        }

        public LaptopBuilder setWarranty(boolean warranty) {
            this.warranty = warranty;
            return this;
        }

        public LaptopBuilder setMsOffice(boolean msOffice) {
            this.msOffice = msOffice;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

public class LaptopOrderApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();

        System.out.print("Add SSD? ");
        boolean ssd = sc.nextBoolean();

        System.out.print("Add Graphics Card? ");
        boolean graphics = sc.nextBoolean();

        System.out.print("Add Extended Warranty? ");
        boolean warranty = sc.nextBoolean();

        System.out.print("Add MS Office? ");
        boolean office = sc.nextBoolean();

        Laptop laptop = new Laptop.LaptopBuilder(brand, ram)
                .setSSD(ssd)
                .setGraphics(graphics)
                .setWarranty(warranty)
                .setMsOffice(office)
                .build();

        laptop.display();
    }
}
