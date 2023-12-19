import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snakes and Ladders!");
        int pos = 0;
        int dice = 0;
        int check = 0;

        int count = 0;

        Random rand = new Random();

        while (pos != 100) {
            dice = rand.nextInt(6); // Generates an int 0 to 5
            dice = dice + 1;
            count++;
            check = rand.nextInt(3);

            switch (check) {
                case 0: // No Play, Stay in Position
                    break;
                case 1: // Ladder
                    if (pos + dice > 100) {
                        break;
                    } else {
                        pos = pos + dice;
                    }
                    break;
                case 2:
                    if (pos - dice < 0) {
                        pos = 0;
                    } else {
                        pos = pos - dice;
                    }
                    break;

            }

            System.out.println("Position: " + pos);

        }

        System.out.println("No of dice rolls: " + count);

    }
}
