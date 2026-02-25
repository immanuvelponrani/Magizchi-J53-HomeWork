import java.io.*;
import java.util.*;

public class SumFromFile {
    public static void main(String[] args) throws Exception {

        File file = new File("numbers.txt");
        Scanner sc = new Scanner(file);

        int sum = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
