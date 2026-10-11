import java.util.Scanner;
public class Assignment2Scanner {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.print("Enter hourly pay rate : ");
        double rate = hi.nextDouble();
        System.out.print("Enter hours worked : ");
        double hours = hi.nextDouble();

        double gross = hours * rate;
        double percent;
        if (gross <= 2000) percent = 10;
        else if(gross<= 4000) percent = 12;
        else if(gross<= 10000) percent = 15;
        else percent = 20;

        double tax = gross * percent / 100;
        double net = gross - tax;

        System.out.println("Gross pay : Php " + gross);
        System.out.println("Withholding Tax(" + percent + "%) : Php " + tax);
        System.out.println("Net Pay : Php " + net);

    }
}
