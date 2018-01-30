import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
  public static void main(String[] args) throws InterruptedException {
    while (true) {
      try (FileWriter fw = new FileWriter("hello.log", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw)) {
        Date d = new Date();
        out.println(d.toString() + " hello world");
        Thread.sleep(1000);
      } catch (IOException e) {
        // exception handling left as an exercise for the reader
      }
    }
  }
}
