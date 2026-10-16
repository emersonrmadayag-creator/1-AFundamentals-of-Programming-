import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment3BufferedReader {
    public static void main(String[] args)  {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT score : ");
            double nsat = Double.parseDouble(hi.readLine());
            System.out.print("Enter parent's monthly salary : ");
            double salary = Double.parseDouble(hi.readLine());
            System.out.print("Enter entrance exam score : ");
            double exam = Double.parseDouble(hi.readLine());

            double average = (nsat + exam) / 2;

            if (salary > 10000 || nsat < 90 || exam < 85) {
                System.out.print("Rejected");
            } else if (salary <= 3500 && average >= 91) {
                System.out.print("Accepted");
            } else {
                System.out.print("For further study");
            }

        } catch (IOException e) {
            System.out.println("Error reading input");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered");
        }
    }
}
