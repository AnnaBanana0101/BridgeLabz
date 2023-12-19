import java.util.Random;

public class TwoPlayer {

    static int flag = 0; // Check for Ladder and give two turns

    public static void main(String[] args) throws Exception {
        System.out.println("Snakes and Ladders!");
        int pos1 = 0;
        int pos2 = 0;

        int dice = 0; // Dice value
        int count = 0; // Dice count

        Random rand = new Random();

        while (pos1 != 100 && pos2 != 100) {
            // Player1
            do {
                dice = rollDice(rand);
                pos1 = checkOption(pos1, dice);
                count++;

                if (pos1 == 100) {
                    System.out.println("Player 1 wins!");
                    break;
                }
            } while (flag == 1);

            // Player2
            do {
                dice = rollDice(rand);
                pos2 = checkOption(pos2, dice);
                count++;

                if (pos2 == 100) {
                    System.out.println("Player 2 wins!");
                    break;
                }
            } while (flag == 1);

        }

        System.out.println("No of dice rolls: " + count);

    }

    private static int rollDice(Random rand) {
        return rand.nextInt(6) + 1;
    }

    private static int checkOption(int pos, int dice) {
        int check = new Random().nextInt(3);

        switch (check) {
            case 0: // No Play, Stay in Position
                flag = 0;
                break;
            case 1: // Ladder
                if (pos + dice > 100) {
                    break;
                } else {
                    pos = pos + dice;
                }
                flag = 1;
                break;
            case 2:
                if (pos - dice < 0) {
                    pos = 0;
                } else {
                    pos = pos - dice;
                }
                flag = 0;
                break;

        }

        return pos;
    }
}
