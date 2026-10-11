import javax.swing.JOptionPane;
public class labQuiz3 {
    public static void main(String[] args){
        double gross = Double.parseDouble(JOptionPane.showInputDialog("Please enter the gross bill : "));
        double payment = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount given to the waiter : "));

        double serviceCharge = gross * 0.12;
        double salesTax = gross * 0.7;
        double netBill = gross + serviceCharge + salesTax;
        double change = payment - netBill;

        JOptionPane.showMessageDialog(null,String.format("Net bill : %.2f%nChange : %.2f", netBill, change));
    }
}
