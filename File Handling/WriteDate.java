import java.io.*;
import java.time.LocalDate;

public class WriteDate {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("date.txt");

        LocalDate today = LocalDate.now();

        fw.write("Today's Date: " + today);

        fw.close();

        System.out.println("Date written to file.");
    }
}
