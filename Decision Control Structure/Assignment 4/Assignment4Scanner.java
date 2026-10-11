import java.util.Scanner;
public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Enter your height (cm) : ");
        double height = hi.nextDouble();
        System.out.print("Enter your age : ");
        double age = hi.nextDouble();
        System.out.print("Citizenship Code (C/N : ");
        String citizen = hi.next().toUpperCase();
        System.out.print("Recomendee Code (R/N) : ");
        String recommendee = hi.next().toUpperCase();

        if (recommendee.equals("R") || (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C"))) {
            System.out.print("Applicant is Accepted");
        } else {
            System.out.print("Applicant is Rejected");

        }
    }
}
