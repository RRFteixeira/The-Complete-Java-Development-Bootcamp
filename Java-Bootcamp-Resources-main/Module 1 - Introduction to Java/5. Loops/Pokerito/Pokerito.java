import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();


        System.out.println("It's like Poker, but a lot simpler." +
        "\n\n" +
        "There are two players, you and the computer." +
        "The dealer will give each player one card." +
        "Then, the dealer will draw five cards (the river)" +
        "The player with the most river matches wins!" +
        "If the matches are equal, everyone's a winner!" +
        "\n\n" +
       "Ready? Type anything if you are.");

       scan.nextLine();

       System.out.println("Here's your card:");
       String yourCard = randomCard();
       System.out.println(yourCard);

       System.out.println("Here's the computer's card:");
       String cpuCard = randomCard();
       System.out.println(cpuCard);


        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");


        for (int i=1; i<=5; i++) {
            scan.nextLine();
            System.out.println("Card " + i + ":\n\n");

            String card = randomCard();
            System.out.println(card);
            if (card==yourCard){
                yourMatches +=1;
            }
            if (card==cpuCard){
                computerMatches+=1;
            }            

        }

        System.out.println("Your matches: " + yourMatches);
        System.out.println("cpu matches: " + computerMatches);

        if (yourMatches > computerMatches) {

            System.out.println("you won.");
        } 
        else if ( yourMatches < computerMatches){
            System.out.println(" you lost.");
        } else {
            System.out.println("its a tie.");
        }


        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static String randomCard (){

        int randomNum = (int) (Math.random() *13 + 1);
        String randomCard ="";
        switch (randomNum) {
            

            case 1: return
                
                "   _____\n"+
                "  |A _  |\n"+ 
                "  | ( ) |\n"+
                "  |(_'_)|\n"+
                "  |  |  |\n"+
                "  |____V|\n";
   
            case 2: return

                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
           
             case 3: return
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n";

            case 4: return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";

            case 5: return
             "   _____ \n" +
             "  |5    |\n" +
             "  | o o |\n" +
             "  |  o  |\n" +
             "  | o o |\n" +
             "  |____S|\n";

             case 6: return
             "   _____ \n" +
             "  |6    |\n" +
             "  | o o |\n" +
             "  | o o |\n" +
             "  | o o |\n" +
             "  |____6|\n";

             case 7: return
       
             "   _____ \n" +
             "  |7    |\n" +
             "  | o o |\n" +
             "  |o o o|\n" +
             "  | o o |\n" +
             "  |____7|\n";
   
             case 8: return
     
             "   _____ \n" +
             "  |8    |\n" +
             "  |o o o|\n" +
             "  | o o |\n" +
             "  |o o o|\n" +
             "  |____8|\n";
      
             case 9: return
             "   _____ \n" +
             "  |9    |\n" +
             "  |o o o|\n" +
             "  |o o o|\n" +
             "  |o o o|\n" +
             "  |____9|\n";

             case 10: return
             "   _____ \n" +
             "  |10  o|\n" +
             "  |o o o|\n" +
             "  |o o o|\n" +
             "  |o o o|\n" +
             "  |___10|\n";
     
             case 11: return

             "   _____\n" +
             "  |J  ww|\n"+ 
             "  | o {)|\n"+ 
             "  |o o% |\n"+ 
             "  | | % |\n"+ 
             "  |__%%[|\n";
     
             case 12: return

             "   _____\n" +
             "  |Q  ww|\n"+ 
             "  | o {(|\n"+ 
             "  |o o%%|\n"+ 
             "  | |%%%|\n"+ 
             "  |_%%%O|\n";
       
             case 13: return 
             "   _____\n" +
             "  |K  WW|\n"+ 
             "  | o {)|\n"+ 
             "  |o o%%|\n"+ 
             "  | |%%%|\n"+ 
             "  |_%%%>|\n";

             default: return "This should not happen"; 
        }
     }

}
