import java.util.Scanner;

public class Delimitiers {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter tow ints (same line)");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(" Enter tow Longs (same line)");

        long long1 = scan.nextLong();
        long long2 = scan.nextLong();

        System.out.println(" Enter tow doubles (same line)");

        double double1 = scan.nextDouble();
        double double2 = scan.nextDouble();

        System.out.println(" Enter tow Strings (same line)");

        String string1= scan.next();
        String string2= scan.next();

        scan.close();


        System.out.println("\n\t Ints are: "+ num1 + " " + num2);

        System.out.println("\n\t longs are: "+ long1 + " " + long2);

        System.out.println("\n\t doubles are: "+ double1 + " " + double2);

        System.out.println("\n\t Strings are: "+ string1 + " " + string2);

    }
    
}
