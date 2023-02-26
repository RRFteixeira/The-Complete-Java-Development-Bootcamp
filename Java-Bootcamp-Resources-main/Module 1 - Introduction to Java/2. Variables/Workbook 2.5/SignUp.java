import java.util.Locale;

import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);


        System.out.println("\nWelcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.

        System.out.println("\n What is your first name?");
        String firstName = scan.nextLine();



        //Ask for their last name.
        System.out.println("\n What is last name?");
        String lastName = scan.nextLine();


        //Ask: how old are you?
        System.out.println("\n How old are you");
        int age = scan.nextInt();

        scan.nextLine();


        // Ask them to make a username. SIDE NOTE:

        System.out.println("\n What is your username?");
        String username = scan.nextLine();
        
        
        /*
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */


        //Ask what city they live in.

        System.out.println("\n What city do you live in?");
        String city = scan.nextLine();

        
        
        //Ask what country that's from.
        System.out.println("\n What country is that?");
        String country = scan.nextLine();



        //Task 2 - Print their information. 

        System.out.println("\nThank you for joining JavaGram!");


        scan.close();

        System.out.println("Your information: \n\tFirst name: "+firstName+"\n\tLast name: "+ lastName+
        "\n\tAge: "+ age+ "\n\tusername: "+username+ "\n\tCity: " +city+ "\n\tCoutry: "+ country);

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
