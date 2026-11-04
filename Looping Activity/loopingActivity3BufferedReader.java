import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class loopingActivity3BufferedReader {
    public static void main(String[] args) {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;
        double amount;

        try {
            do {
                System.out.print("Enter amount ( 0 to stop ) : ");
                amount = Double.parseDouble(hi.readLine());

                if (amount != 0) {
                    if (amount < 0 && balance + amount < 0) {
                        System.out.print("INSUFFICIENT FUNDS! ");
                    } else {
                        balance += amount;
                    }
                    System.out.printf("Outstanding Balance :  P%.2f%n" , balance);

                }
            } while (amount != 0);
        }catch (IOException e) {
            System.out.println ("Invalid Input");
        }
    }
}
