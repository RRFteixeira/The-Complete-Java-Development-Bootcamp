
import java.util.Locale;
import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {

         
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Welcome");


        int counter = 0 ;

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;


        System.out.println("\nprice of the coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;


        System.out.println("\nHow many times do you buy coffee per day?");
        int coffeeAmount= scan.nextInt();
        counter++;


        scan.close();


        System.out.println("\nThank you " + name +" for answering all " + counter+ " questions." );


        System.out.println("You spend "+ (coffeeAmount*coffeePrice) +" dollars in coffee.");
        
    }
    
}
