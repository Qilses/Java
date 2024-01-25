import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
 

public class Java6 {
    public static void main(String[] args) {
        // Vilka månader som finns från number 0-11
        String[] months = new String[]{"January","February","Mars","April","Maj","Juni","July","Augusti","September","Oktober","November","December"};
        
        // Denna del ger året, månaden, dagen
        String nuvarandaDatum = datum();
        String[] datum = nuvarandaDatum.split("-");        
        System.out.println("Året är " + datum[0] + " Månaden är " + months[Integer.parseInt(datum[1])-1] + " Dagen är " + datum[2]);

    }

    public static String datum() {
        // Returnar en formaterat datum som sedan används för regexen för att lista namnet på månaden 
        return DateTimeFormatter.ofPattern("yyyy-MM-dd",Locale.ENGLISH).format(LocalDateTime.now());
    }
}
