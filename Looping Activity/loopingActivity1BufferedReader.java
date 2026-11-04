import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class loopingActivity1BufferedReader {
    public static void main(String[] args) {

        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));
        int highest = 0;
        int lowest = 0;

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + " : ");
                int num = Integer.parseInt(hi.readLine());

                if (i == 1) {
                    highest = num;
                    lowest = num;
                } else {
                    if (num > highest) highest = num;
                    if (num < lowest) lowest = num;
                }
            }


                    System.out.println("Highest :" + highest);
                    System.out.println("Lowest :" + lowest);
            } catch (IOException e) {
            System.out.println("Input Error");
        }

    }
}
