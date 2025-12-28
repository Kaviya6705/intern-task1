package task1;
import java.io.*;

public class task1 {
public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Welcome to Java");
            bw.newLine();
            bw.write("File handling operations");
            bw.close();
            System.out.println("File written successfully");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            FileWriter fw2 = new FileWriter(fileName, true);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.newLine();
            bw2.write("Content updated using Java");
            bw2.close();
            System.out.println("\nFile modified successfully");

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
