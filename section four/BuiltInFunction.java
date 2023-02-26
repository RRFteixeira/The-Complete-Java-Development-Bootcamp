public class BuiltInFunction {
    
    public static void main(String[] args) {


        double sine = Math.sin(1.2);
        System.out.println("\nThe sin of 1.2 is : " + sine);

        double power = Math.pow(2, 4);
        System.out.println("\n2 to the power of 4 is : " + power);

        double random = (Math.random()  * 10) / 1 ;
        int intRandom = (int) random;
        System.out.println("\nThe random value is : " + random);
        System.out.println("\nThe int random value is : " + intRandom);


    }


}
