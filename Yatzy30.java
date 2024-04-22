import java.util.*;


public class Yatzy30 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in); 
        ArrayList<Integer> numb = new ArrayList<>();

        //Ska loopa om så att man kastar tärningen 6 gånger
        for (int i = 0; i < 6; i++) {
            int tarningKast = (int) (Math.random() * 6) + 1;
            System.out.println("Tärningskast: " + tarningKast);
            numb.add(tarningKast);
        }
        // välj ett number
        //kollar så att man inte välger mer än 6
        try {
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(SC.nextLine());
                numb.add(num); 
            }
        } catch (NumberFormatException e) {
            System.out.println("Ogiltigt nummer");
        }
        
        SC.close();
}
}