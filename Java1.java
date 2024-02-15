import java.io.*;

public class Java1 {
    public static void main (String[] arg) throws IOException{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String kons = "bcdfghjklmnpqrsvxzBCDFGHJKLMNQPRSVXZ";
        while (true) {
            String s1 =input.readLine(); //läs nästa rad
            if (s1 == null) 
                break; //end of file
            String s2 =""; // rad som skall skrivas ut

            //löp ingeom alla tecken på den inlästa raden
            for (int i=0; i< s1.length(); i++) {
                char c = s1.charAt(i);
                s2 = s2 + c;
                if (kons.indexOf(c)>=0) // är c en konstant
                s2 = s2 + 'o' + c; // ja
            }
            System.out.println(s2);
        }
    }
}