/**
 * Java4
 */
import java.time.LocalTime;
import javax.swing.JOptionPane;


public class Java4 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"klockan är " + klockan());
    }
    public static String klockan(){
        return LocalTime.now().toString();
    }
}