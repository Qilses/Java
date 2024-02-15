import javax.swing.JOptionPane;

public class JavaWhile {
    public static void main(String[] args) {
    String tal = JOptionPane.showInputDialog(null, "Tell me a number that is lower then 10 pls....");
    int i = Integer.parseInt(tal);
    while (i < 10) {
      JOptionPane.showMessageDialog(null, (i));
      i++;
    }
}
}
