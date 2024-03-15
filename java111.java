import java.util.HashSet; import java.util.LinkedHashSet; import java.util.Scanner;
public class java111 { public static void main(String[] args) {
            //skapar Scanner 
        Scanner SC = new Scanner(System.in);  
            //skapar ett number
        int[] array = new int[1000];
            // Gör en lista i årdning
        HashSet<Integer> numb = new LinkedHashSet<Integer>();


        
        System.out.println("Skriv ner alla number, för att lämna clicka 'ctrl' + 'Z'............." + "!");
            //Om man clickar ctrl + Z + enter så kommer "hasNextLine" avsluta programet och printa ut alla skrivna number.
        while (SC.hasNextLine()) {
            try {
                for (int i = 0; i < array.length; i++) {
                    int num = Integer.parseInt(SC.nextLine()); 
                    numb.add(num);
                }
            } catch (Exception e) {
                    System.out.println("Ogiltigt nummer"); 
                    break;
                } 
            }

        //printar ut vad numberna är som utan ha flera som upprepas
        SC.close();
    System.out.println(numb);
    }
}