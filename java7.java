import javax.swing.JOptionPane;

public class java7 {

    public static void main(String[] args) {
        
        // Ange startbeloppet, räntan och tiden i år
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ange startbeloppet: "));
        

        // Det finns ett problem med koden där ifall du skriver komma (,) istället för (.) så kommer det inte funka som det ska!
        // ifall start belopet är för stort så kommer det fortsätta programet men svara "För stort uttag"
        double r = Double.parseDouble(JOptionPane.showInputDialog("Ange räntan som decimal: "));

        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ange tiden i år: "));
        double ut = Double.parseDouble(JOptionPane.showInputDialog("Ange uttagsbeloppet: "));
        
        
        // Beräkna det slutliga kapitalet
        double slutligtKapital = beloppVidUttag(b,r,n,ut);
       

        // Skriv ut det slutliga kapitalet
        JOptionPane.showMessageDialog(null, "Det slutliga kapitalet är: " + slutligtKapital);
         //Den kommer svara i E ifall fallet blir för långt!
        
}

    // Övrig metoder 
    public static double beloppVidUttag(double b, double r, int n, double ut) {
        if (ut > b * 0.01 * r) { // är uttaget större än räntan?
            JOptionPane.showMessageDialog(null, "För stort uttag");
            return 0;
        } else {
            for (int i = 0; i<=n; i++){
                b = b + b * 0.01 * r - ut;
                System.out.println(beloppVidUttag(b, r, n, ut));
            }    
            return b;
        }
    } 
}


// Det finns ett problem att ibland på visa värden så kommer det inte ge något vättight svar!