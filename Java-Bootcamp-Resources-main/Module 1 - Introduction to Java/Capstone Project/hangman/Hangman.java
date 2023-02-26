import java.util.Scanner;

public class Hangman {

    static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};



    public static void main(String[] args) {

        String gameWordString = words[randomNum()];
        char[] gameWordChar = gameWordString.toCharArray();
        char[] board = new char[gameWordChar.length];

        System.out.println(gameWordString);

        for (int i = 0 ; i<board.length ; i++){
            board[i] = '_'; 
        }

        int tries = 0 ;
        String misses = "";

        while (tries<6){

            int count=0; 

            System.out.println("tries: " + tries);
            printGallows(tries);

            System.out.print("Word: ");
            for (int i = 0 ; i<board.length ; i++){
                System.out.print(board[i] + " ");
            }
            System.out.print("\nMisses :" + misses);

            System.out.print("\nGuess: ");
            String guess = scan.next();
            char[] guessChar = guess.toCharArray();

            for (int i = 0 ; i<gameWordChar.length; i++){
                if (guessChar[0]==gameWordChar[i]){
                    board[i]=guessChar[0];
                    count =1 ;
                } 
            }

            if (gameWordString.equals(String.valueOf(board))){
                System.out.println("You Won! Congrats");
                System.exit(0);
            }

            if (count==1){
                continue;
            } else {
                misses =misses + guessChar[0];
                tries++;
            }
        }


        printGallows(tries);
        System.out.println("RIP!");
        System.out.println("The word was: " + gameWordString);
        scan.close(); 
    }


    public static int randomNum (){
        return (int) (Math.random()*64);
    }

    public static void printGallows (int guesses){
        switch(guesses){
            case 0: System.out.println(gallows[0]); break;
            case 1: System.out.println(gallows[1]); break;
            case 2: System.out.println(gallows[2]); break;
            case 3: System.out.println(gallows[3]); break;
            case 4: System.out.println(gallows[4]); break;
            case 5: System.out.println(gallows[5]); break;
            case 6: System.out.println(gallows[6]); break;
            default: System.out.println("this shoulnt happen");
        }
    }


    
}





