import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");

        System.out.println("Select 'a' to buy a car");
        System.out.println("Select 'b' to sell a car");

        String option =scan.nextLine();

        switch (option){

            case "a": 
            
            System.out.println("What is your budget?");

            int budget = scan.nextInt();

            if (budget>=10000){

                System.out.println("Great, we have several cars for you to choose.");
            

                System.out.println("\nDo you have insurance?");

                String insurance = scan.next();

                System.out.println("\nDo you have Driver licence?");

                String licence = scan.next();

                System.out.println("\nWhat is your credit score?");

                int credit = scan.nextInt();

                if (insurance.equals("yes") && licence.equals("yes") && credit>6000 ) {

                System.out.println("Sold!");                
            
                } else {

                    System.out.println("Sorry, no can do...");
                }
            }



        else {

                System.out.println("Sorry, we dont have any cars under 10k");
            }


            break;


            case "b": 
                
                System.out.println("\nValue of the car?");
                int value = scan.nextInt();
                System.out.println("\nselling Price??");
                int sellingPrice = scan.nextInt();

                if (value > sellingPrice && sellingPrice<30000){

                    System.out.println("\nWe will buy your car.");

                } else {

                    System.out.println("\nSorry, we cant buy your car.");
                }

            
            
            break;
            default: System.out.println("\nInvalid option");
        }

        scan.close();



    }
    
}
