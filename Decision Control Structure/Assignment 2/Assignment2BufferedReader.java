import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment2BufferedReader {
    public static void main(String[] args)  {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the hourly pay rate : ");
            Double rate = Double.parseDouble(hi.readLine());
            System.out.print("Enter the hours worked : ");
            Double hours = Double.parseDouble(hi.readLine());

            double gross = hours * rate;
            double percent;
            if (gross <= 2000) percent = 10;
            else if (gross <= 4000) percent = 12;
            else if (gross <= 10000) percent = 15;
            else percent = 20;

            double tax = gross * percent / 100;
            double net = gross - tax;

            System.out.println("Gross pay : Php " + gross);
            System.out.println("Withholding Tax(" + percent + "%) : Php " + tax);
            System.out.println("Net Pay : Php " + net);

        } catch (IOException e) {
            System.out.println("Error reading input");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered");
        }
    }
}
