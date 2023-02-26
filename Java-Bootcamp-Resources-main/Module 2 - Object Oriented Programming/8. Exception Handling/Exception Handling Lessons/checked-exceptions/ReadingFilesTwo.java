import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesTwo {
    public static void main(String[] args) {
            loadData("Greetings.txt");    
    }

    public static void loadData(String name) {

        try{
            FileInputStream fis = new FileInputStream(name);
            Scanner scan = new Scanner(fis);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
            
    }

}
