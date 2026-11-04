import javax.swing.JOptionPane;
public class loopingActivity3JOptionPane {
    public static void main(String[] args) {
        double balance = 20000.00;
        double amount;

        do {
            amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount (0 to stop) :"));

            if (amount != 0) {
                if (amount < 0 && balance + amount < 0) {
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT FUNDS!");
                }else {
                    balance += amount;
                }
                JOptionPane.showMessageDialog(null,"Outstanding Balance: P" + String.format("%.2f", balance));
            }

        } while (amount != 0);


    }
}
