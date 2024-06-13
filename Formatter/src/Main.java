import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[ ] args) {
        Scanner s = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while(count < 3) {
                //your code goes here
                String texto = s.nextLine();
                f.format(texto, "\n");
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

      public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
      }
}