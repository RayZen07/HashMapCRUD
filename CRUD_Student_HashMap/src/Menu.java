import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void menu() {
        while (true) {
            System.out.println("Press 1 to Create");
            System.out.println("Press 2 to Read");
            System.out.println("Press 3 to Update");
            System.out.println("Press 4 to Delete");
            System.out.println("Press 0 to Exit");
            try {
                int ch = Integer.parseInt(bf.readLine());
                if (ch == 1) {
                    Operation.create();
                } else if (ch == 2) {
                    Operation.read();
                } else if (ch == 3) {
                    Operation.update();
                } else if (ch == 4) {
                    Operation.delete();
                } else if (ch == 0) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
