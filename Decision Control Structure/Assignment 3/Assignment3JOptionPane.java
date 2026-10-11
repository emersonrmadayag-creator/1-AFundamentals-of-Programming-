import javax.swing.JOptionPane;
public class Assignment3JOptionPane {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT Score"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' salary"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Enter entrace exam score"));

        double average = (nsat + exam) / 2;
        String result;

        if(salary>10000 ||nsat <90 || exam < 85){
            result = "Rejected";
        } else if (salary <=3500 && average >=91) {
            result = "Accepted";
        } else {
            result = "For further study";
        }
        JOptionPane.showMessageDialog(null,"Result : " + result);
    }

}
