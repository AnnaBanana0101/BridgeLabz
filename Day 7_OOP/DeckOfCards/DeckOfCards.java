import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Deck of Cards!");
        System.out.println("");

        String [] suits = {"Club", "Diamond", "Heart", "Spade"};
        String [] ranks = {"2", "3", "4", "5", "6", "7", "8",
        "9", "10", "Jack", "Queen", "King", "Ace"};

         String[][] cards = new String[4][9];

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<9; j++)
            {
                String suit = randomGenerator(suits);
                String rank = randomGenerator(ranks);
                cards[i][j] = suit + "-" + rank;
                System.out.print(cards[i][j]+ " ");
            }
            System.out.println();
        }


    }

    public static String randomGenerator(String[] array)
    {
        if(array!= null && array.length>0)
        {
            Random random = new Random();
            int random_index = random.nextInt(array.length);

            return array[random_index];
        }

        return null;
    }
}
