import javax.swing.JOptionPane;
public class Assignment2JOptionPane {
    public static void main(String[] args) {
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate :"));
        double hour = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked :"));

        double gross = hour * rate;
        double percent;
        if (gross <= 2000) percent = 10;
        else if(gross<= 4000) percent = 12;
        else if(gross<= 10000) percent = 15;
        else percent = 20;

        double tax = gross * percent / 100;
        double net = gross - tax;

        String result = "Gross Pay : Php" + gross + "\n" + "Withholding Tax (" + percent + "%) : Php " + tax + "\n" + "Net Pay : Php " + net;
        JOptionPane.showMessageDialog(null,result);

    }
}
