import java.io.*;

public class RemoveSpaces {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new FileReader("input.txt"));

        BufferedWriter bw =
            new BufferedWriter(new FileWriter("cleaned.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            // Remove extra spaces
            line = line.trim().replaceAll("\\s+", " ");

            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Extra spaces removed.");
    }
}
