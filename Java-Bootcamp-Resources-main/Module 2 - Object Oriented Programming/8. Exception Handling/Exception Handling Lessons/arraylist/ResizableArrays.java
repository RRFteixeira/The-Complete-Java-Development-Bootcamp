import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        
        ArrayList <String> names = new ArrayList<String>();

        names.add("Joe");
        names.add("Jim");
        names.add("John");

        names.set(0, "Rodolfo");

        names.add(3,"Kattie");

        names.remove(1);

        for (int i = 0; i < args.length; i++) {
            System.out.println(names.get(i));
        }
    }
}
