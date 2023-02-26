public class LogicalOperators {
    public static void main(String[] args) {
        
        int chemestryGrade= 67;
        int englishGrade= 65 ;
        int mathGrade = 72;
        String language = "Java";


        if ( chemestryGrade > 75 || englishGrade > 75 || mathGrade>75 || language.equals("Python")) {

            System.out.println("Congrats, you got the scholarship.");

        }
        else {

            System.out.println("We're sorry, you didnt got the shcolarship.");
        }

        int credits= 32;
        double GPA = 3.2;
        
        if (credits>=40 && GPA>2.0) {

            System.out.println("Congrats, you got the diploma");
        } 
        else {

            System.out.println("Sorry, you need 40 credits and a minimum GPA pf 2.0");
        }
    }
}
