import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFileReader {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\LENOVO\\Desktop\\DSU\\DSU data\\scanner.txt");
            Scanner scanner = new Scanner(file);

            // Print the message outside the loop if you want it to appear only once
            System.out.println("This is my first \"program\"");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Close the scanner after use to release resources
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
