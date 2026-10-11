import javax.swing.JOptionPane;
public class Assignment4JOptionPane {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (cm) : "));
        double age = Double.parseDouble(JOptionPane.showInputDialog("Enter age : "));
        String citizen = JOptionPane.showInputDialog("Citizenship code (C/N) : ").toUpperCase();
        String recommendee = JOptionPane.showInputDialog("Recommendee code (R/N) : ");

        String result;
        if (recommendee.equals("R") || (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C"))) {
            result = "Applicant is Accepted";
        }else { result = "Applicant is Rejected";
        }
        JOptionPane.showMessageDialog(null, result);

    }
}

