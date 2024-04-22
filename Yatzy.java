import java.util.*;


public class Yatzy {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        List<Integer> picked_dices = new ArrayList<>();
        LinkedHashMap<String,Integer> players = new LinkedHashMap<String,Integer>();
        boolean running = true;
        System.out.println("How many players: ");
        int numberOfPlayers = Integer.parseInt(SC.nextLine());

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.format("Enter player %d name:\n",i+1);
            String playerName = SC.nextLine();
            players.put(playerName, 0);

        }

        System.out.println(players.toString());
        // Kastar täriningen 6 gånger och lägger de på terminal

        // ska vällja ett number att behålla

        while (running){
            for (String name : players.keySet()) {
                System.out.format("Current turn: %s\n", name);
                
            }
            break;
         }
        
        
         System.out.println(picked_dices.toString());
         Integer sum = sum(picked_dices);
         System.out.println(sum);

         SC.close();
    }
    
    public static Integer sum(List<Integer> integers){

        return integers.stream()
        .reduce(0, Integer::sum);
    }
    
    public static List<Integer> roll_dice(int dice_to_roll) {
        List<Integer> dices = new ArrayList<Integer>();
        for (int i = 0; i < dice_to_roll; i++) {
            int tarningKast = (int) (Math.random() * 6) + 1;
            dices.add(tarningKast);
        }
    
        return dices;
    }

    
}

