import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");




        Item_object chocolate = new Item_object("Chocolate", 2.99 , 2);
    
    
        Item_object[][] items = new Item_object[][] { 
            { chocolate , new Item_object("Fresca", 1.49, 3), new Item_object("Brisk", 2.49, 2) }, 
            { new Item_object("Fanta", 1.99, 2) , new Item_object("Barq's", 1.49, 2), new Item_object("A & W", 2.49, 3) }, 
            { new Item_object("Crush", 1.99, 2) , new Item_object("C-Cola", 1.49, 2), new Item_object("Berry", 2.49, 1) }
            };  

        Machine_class vendingmachine = new Machine_class(items);
        Item_object amendoin = vendingmachine.getItem(0, 0);
        amendoin.setName("amendoin");
        vendingmachine.setItem(amendoin, 0, 1);






            
        Scanner scan = new Scanner(System.in);
     
        

        while (true){
            System.out.println(vendingmachine);

            System.out.println("\npick a row:");
            int row = scan.hasNextInt() ? scan.nextInt() : 404 ;
            scan.nextLine();

            System.out.println("\npick a spot:");
            int spot = scan.hasNextInt() ? scan.nextInt() : 404 ;
            scan.nextLine();

            if (row == 404 || spot == 404 || row>= vendingmachine.getLength() || spot>= vendingmachine.getRowLength() || row < 0 || spot < 0){
                System.out.println("invalid input");
                continue;
            } 



            if (vendingmachine.dispense(row, spot)) {
                System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            }
            else{
                   System.out.println("\nSorry, we dont have it. Press 1 to purchase another: ");
            }  
            if (scan.nextInt() != 1){
                System.out.println("ty!");
                break;
            } 
        }            

            
         scan.close();
        
        
    }
}
