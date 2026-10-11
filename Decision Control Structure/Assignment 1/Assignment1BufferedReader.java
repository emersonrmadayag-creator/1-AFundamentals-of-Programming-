import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment1BufferedReader {
    public static void main(String[] args) {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a Year : ");
            int year = Integer.parseInt(hi.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (IOException e) {
            System.out.println("Error reading input ");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid year");
        }
    }
}
