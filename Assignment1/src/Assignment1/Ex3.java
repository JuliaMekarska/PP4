package Assignment1;
import java.io.*;

public class Ex3 {
    public static void writeToFile(String line, String path) throws IOException {
        FileWriter writer = new FileWriter(path, true);
        writer.write(line + "\n");
        writer.close();
    }
}
