import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4BufferedReader {
    public static void main(String[] args) {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your height (cm) : ");
            double height = Double.parseDouble(hi.readLine());
            System.out.print("Enter your age : ");
            double age = Double.parseDouble(hi.readLine());
            System.out.print("Citizenship Code (C/N : ");
            String citizen = hi.readLine();
            System.out.print("Recomendee Code (R/N) : ");
            String recommendee = hi.readLine();

            if (recommendee.equals("R") || (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C"))) {
                System.out.print("Applicant is Accepted");
            } else {
                System.out.print("Applicant is Rejected");
            }
        } catch (IOException e) {
            System.out.println("Input error : ");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered");
        }
    }
}