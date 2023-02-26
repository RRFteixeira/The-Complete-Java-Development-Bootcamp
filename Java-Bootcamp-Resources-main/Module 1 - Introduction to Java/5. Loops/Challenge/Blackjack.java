import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();


        //Task 4 – Get two random cards.

        int number1 = randomNum();
        int number2 = randomNum();
        String playerCard1 = randomCard(number1);
        String playerCard2 = randomCard(number2);
        System.out.println("\n You get a \n" + playerCard1 + "\n and a \n" + playerCard2);
        int handValue = Math.min(10, number1) + Math.min(10, number2);
        System.out.println("Your total is :" + handValue);

        

        
        int number3 = randomNum();
        int number4 = randomNum();
        String dealerCard1 = randomCard(number3);
        String dealerCard2 = randomCard(number4);
        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());
        System.out.println("\nThe dealer's total is hidden");





        while (true){
            String move= hitOrStay();

            if (move.equals("hit")){
                int num =randomNum();
                String card = randomCard(num);
                System.out.println(card);
                handValue += Math.min(10, num);
                System.out.println("Your total is :" + handValue);
                if (handValue>22){                    
                    System.out.println("Player bust"); 
                    System.out.println("Exiting the game");
                    System.exit(0);
                }
            } else {
                break;
            }
        }


        int dealerValue = Math.min(10, number3) + Math.min(10, number4);
        System.out.print(dealerCard1 + dealerCard2 );        
        System.out.println(dealerValue);


        while (true){

            if (dealerValue<17){

                System.out.println("dealer: " + dealerValue);
                System.out.println("Dealer card: ");
                int num = randomNum();
                String card = randomCard(num);
                System.out.println(card);
                dealerValue += Math.min (10, num);
                continue;

            } else {
                if (dealerValue>=22){                            
                    System.out.println("Dealer Value: " + dealerValue);
                    System.out.println("Dealer bust"); 
                    System.out.println("Player Won.");
                    System.out.println("Exiting the game");
                    System.exit(0);
                    break;
                }
                System.out.println("Dealer Value: " + dealerValue);
                break;
            }
        }        

        checkWin(handValue, dealerValue);
        
         scan.close();

         

    }


    public static void checkWin (int handValue, int dealerValue) {

        if (handValue>dealerValue){
            System.out.println("Player Won!");
        }
        else {
            System.out.println("Dealer Won!");
        }
    }


    public static String hitOrStay (){
        String move = scan.nextLine();
        while (!move.equalsIgnoreCase("hit") && !move.equalsIgnoreCase("stay")){
            System.out.println("Please write 'hit' or 'stay'");
            move = scan.nextLine();
        }
        return move;

     }


    public static int randomNum() {
        int randomNum = (int) (Math.random() *13 + 1); 
        return randomNum;
     }

    public static String randomCard (int randomNum){
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

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

    }

