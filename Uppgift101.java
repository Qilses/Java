import java.io.*;
import javax.swing.JOptionPane;

public class Uppgift101 {
    public static void main(String[] args) throws IOException {


        
        String filnamn = JOptionPane.showInputDialog(null,"Vad heter filem med resultat?");

        while (true) {
            String ny = JOptionPane.showInputDialog("namn" + "?");
            if (ny == null) 
                break;
            String nyPoäng = JOptionPane.showInputDialog("Poäng för " + ny + " ?");
            
                int nyP = Integer.parseInt(nyPoäng);
                boolean inteInlagd = true;
            BufferedReader inström = new BufferedReader(new FileReader(filnamn));
            PrintWriter utström = new PrintWriter(new BufferedWriter(new FileWriter("file.tmp")));

            while (true) {
                String rad1 = inström.readLine();
                if (rad1 == null) {
                    break;
                }
                String rad2 = inström.readLine();
                int Poäng = Integer.parseInt(rad2);

                if (nyP > Poäng && inteInlagd) {
                    utström.println(ny);
                    utström.println(nyPoäng);
                    inteInlagd = false;
                }
                utström.println(rad1);
                utström.println(rad2);
            }
            if (inteInlagd) {
                utström.println(ny);
                utström.println(nyPoäng);
            }
            inström.close ();
            utström.close ();

            inström = new BufferedReader
                        (new FileReader("fil.tmp"));

            utström = new PrintWriter
                        (new BufferedWriter 
                        (new FileWriter (filnamn)));

            while (true) {
                String rad = inström.readLine();
                if (rad == null) {
                    break;
                }    
                utström.println(rad);

            }
            inström.close();
            utström.close();
        }
    }
}
