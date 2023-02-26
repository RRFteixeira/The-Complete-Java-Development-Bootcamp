import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        //Task 2, call celsiusToFahrenheit and store the result in the fahrenheit array. 
        //Task 4, Call printTemperatures for celsius and fahrenheit.

        printTemperatures(celsius, "celsius");
        printTemperatures(fahrenheit, "fahrenheit");
    }

    public static double[] celciusToFahrenheit (double celsius[]){
        double[] fahrenheit= new double[celsius.length];

        for (int i = 0 ; i < fahrenheit.length ; i++ ){
            fahrenheit[i]= (celsius[i]/5.0 * 9.0) + 32 ;
        }
        return fahrenheit;
    }

     public static void printTemperatures(double[] temp , String type){
            System.out.println( type + ": ");            
            for (int i=0 ; i<temp.length; i++){
                System.out.print(String.format("%.2f", temp[i]) + " "  );
            }           
            System.out.println("\n");

    }


}
