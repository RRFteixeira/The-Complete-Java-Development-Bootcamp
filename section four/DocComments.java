public class DocComments {

    public static void main(String[] args) {
        

        greet();
    
}

/**
 * Fuction name : greet
 * 
 * Inside the function:
 *  1.prints: 'Hi'
 */
public static void greet () {

    System.out.println("Hi");
}



/**
 * Function name: printText
 * 
 * @param name (String)
 * @param age (String)
 * Inside the function:
 * 1. Prints a the name and age in a text. 
 * 
 */
public static void printText(String name, String age) {


    System.out.println("Hi, I'm"+ name+ " and I am " +age+" years old.");

}


/**
 * Fuction name : calculateArea
 * 
 * @param len (double)
 * @param wid (double)
 * @return    (double)
 * 
 * Inside the functio:
 * 1. Calculates the area of a retangle and returns it. 
 * 
 */

public static double calculateArea (double len, double wid) {


    double area = len * wid;

    return area;
}

}
