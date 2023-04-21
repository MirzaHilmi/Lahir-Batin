import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(80);
            }
        } catch (InterruptedException | IOException err) {
            System.out.println(err.getMessage());
        }
    }
}
