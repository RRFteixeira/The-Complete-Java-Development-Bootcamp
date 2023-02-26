import java.util.Scanner;

public class Javapedia {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.

        int figureNum = scan.nextInt();
        scan.nextLine();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.    
        
        String[][] table = new String[figureNum][3];
         
        //Watch out for the nextLine() pitfall. 
        /* Task 3 
        for (int i =0 ; i < table.length; i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            pick up and store figure's name.   

            System.out.print("\t - Date of birth: ");
            pick up and store figure's birthday.

            System.out.print("\t - Occupation: ");
            pick up and store figure's occupation. 

            System.out.print("\n");

        }
        
        */

        for (int i =0 ; i < table.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: " );
            // pick up and store figure's name.   
            table[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: " );
            // pick up and store figure's birthday.
            table[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: " );
            // pick up and store figure's occupation. 
            table[i][2] = scan.nextLine();
            System.out.print("\n");

        }

        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 

        print2DArray(table);

        System.out.print("\nWho do you want information on? ");  
        String search = scan.nextLine();


            for (int i = 0 ; i < table.length; i++){
                if (table[i][0].equals(search)){
                    System.out.println("\t Name: " + table[i][0]);
                    System.out.println("\t Date of birth: " + table[i][1]);
                    System.out.println("\t Occupation: " + table[i][2]);
                    break;
                }
                if (i==(table.length-1)){
                    System.out.println("Name not found.");
                }

            }       

        
            scan.close();
        }


        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        
    

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

    public static void print2DArray (String[][]array){

        for (int i = 0 ; i< array.length; i++){

            for (int j = 0 ; j< array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");

        }
    }


}
