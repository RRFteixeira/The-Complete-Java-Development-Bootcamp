public class ReturnValues {

    public static void main(String[] args) {
        
        double area1= measureRectangle(2.0, 3.0, "area");
        double area2= measureRectangle(2.0, 3.0, "perimeter");


        stringPrinter(area1, "area");
        stringPrinter(area2, "perimeter");

    }
    
/**
 * Measures perimeter or area of a rectangle
 * 
 * @param len
 * @param wid
 * @param option
 * @return
 */
    public static double measureRectangle (double len, double wid, String option) {

        if (len<0 || wid<0){

            System.out.println("values cant be negative");
            System.exit(0);

        }

        switch (option){

            case "area": return len*wid;

            case "perimeter": return 2 * (len + wid);

            default : return 404;
        }
        
        
    }
/**
 * Prints a measure
 * 
 * 
 * @param measure
 * @param option
 */
    public static void stringPrinter (double measure, String option) {

        System.out.println("the "+ option +" of the rectangle is "+ measure);

    }


}
