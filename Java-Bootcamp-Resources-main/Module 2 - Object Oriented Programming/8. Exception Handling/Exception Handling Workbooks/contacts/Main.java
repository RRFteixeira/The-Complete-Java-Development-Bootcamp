import java.text.ParseException;

import models.Contact_object;

public class Main {
    public static void main(String[] args) {
        



    
        try{
            Contact_object rodolfo_contact = new Contact_object("Rodolfo", "03/15/1994" ,"918057656");
            System.out.println(rodolfo_contact);
        } catch (ParseException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("precess complete.");
        }
    
    
    
    
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
