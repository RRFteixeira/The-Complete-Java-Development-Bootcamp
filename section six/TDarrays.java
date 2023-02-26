import java.util.Arrays;

public class TDarrays {

    public static void main(String[] args) {
        

        int[][] grades = {
            {12,12,14,13},
            {17,18,18,19},
            {19,19,20,19}
        };

        grades[0][3] = 10;

        for (int i = 0 ; i<grades.length; i++) {

            switch (i){
                case 0: System.out.print("\t Rodolfo: "); break;
                case 1: System.out.print("\t Diogo: "); break;
                case 2: System.out.print("\t Eva: "); break;
            }

            for (int j = 0 ; j<grades[0].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
