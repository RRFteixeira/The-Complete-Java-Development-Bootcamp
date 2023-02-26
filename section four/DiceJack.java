import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {


        System.out.println(" Enter three numbers between 1 and 6");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        scan.close();

        if (num1 < 1 || num2<1 || num3<1 || num1 > 6 || num2> 6|| num3>6 ){
            System.out.println("numbers can not be less than 1 or higher than 6. Shutting game down.");
            System.exit(0);
        }        

        int roll1 = rollDice();
        System.out.println(roll1);
        int roll2 = rollDice();
        System.out.println(roll2);
        int roll3 = rollDice();
        System.out.println(roll3);


        int sumOfNumbers = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;

        System.out.println(" The numbers sum is: " + sumOfNumbers);
        System.out.println(" The rolls sum is: " + sumOfRolls);

        if (checkWin(sumOfNumbers, sumOfRolls)){
                System.out.println("Congratulations, you won");
        } else {
                System.out.println("Sorry, better luck next time");          
        }
    }


    public static int rollDice() {
        double randomNumber = Math.random()*6;
        return (int)randomNumber+1;
    } 

    public static boolean checkWin (int sumOfNumbers , int sumOfRolls){
            return (sumOfNumbers > sumOfRolls  && sumOfNumbers-sumOfRolls<=3);
    }







}


