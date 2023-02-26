import java.util.Arrays;

public class ReferenceTrap {

    public static void main(String[] args) {




            String[] staffLastYear = {"joao", "pedro", "jorge" };
            String[] staffLastYear2 = {"joao", "pedro", "jorge" };

            String[] staffThisYear = staffLastYear;     // Copia a referencia!!
            staffThisYear[1]="Abby";                    // vai actualizar os 2 arrays!!

            System.out.println("Staff last year: " + Arrays.toString(staffLastYear));
            System.out.println("Staff This year: " + Arrays.toString(staffThisYear));
            System.out.println("\n");


            
            String[] staffThisYear2 = Arrays.copyOf(staffLastYear2, staffLastYear2.length);  //É necessário criar um novo array de modo a actualizar simplesmente o novo array


            staffThisYear2[1]="Abby"; 

            System.out.println("Staff last year2: " + Arrays.toString(staffLastYear2));
            System.out.println("Staff This year2: " + Arrays.toString(staffThisYear2));
        
    }
    
}
