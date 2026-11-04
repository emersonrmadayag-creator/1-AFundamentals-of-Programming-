import javax.swing.JOptionPane;
public class loopingActivity2JOptionPane {
    public static void main(String[] args) {
        String out = "";

        for (int i = 2; i <=100; i += 2) {
            out += i + " ";
            if ( i % 20 == 0) {
                out += "\n";
            }
        }
        JOptionPane.showMessageDialog(null,out);

    }
}
