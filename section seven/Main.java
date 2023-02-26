import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires","keys"}),
            new Car("Nissan", 5000, 2019, "yellow", new String[] {"tires","keys"}),
            new Car("Dodge", 7000, 2002, "black", new String[] {"tires","filter"}),
            new Car("Honda", 3500, 2000, "black", new String[] {"tires","filter"}),
            new Car("BWM", 1200, 2015, "black", new String[] {"tires","filter"})
        
        };

        Dealership dealership = new Dealership(cars);


        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");

        String make = scan.nextLine();        

        //pick up make
        System.out.print("Enter your budget: ");
        //pick up budget
        double budget = scan.nextInt();
        scan.nextLine();

        int index = dealership.search(make, budget);

        if (index == 404){
            System.out.println("Feel free to browse through our collection of cars.");
            System.out.println(dealership);            
        }
        
        String newString = scan.nextLine();
        
        if (newString.equalsIgnoreCase("yes")){
            dealership.sell(index);
        }

        // dealership.sell(2);

        // dealership.setCar(cars[2], 2);

        // System.out.println("\n\n");

        // System.out.println(dealership.search("Dodge", 8000));

        

        

        scan.close();
        
    }
    
}
