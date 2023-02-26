public class MathOperations {
    public static void main(String[] args) {
        

        int bagOfSweets1 = 5 ;
        int bagOfSweets2 = 10 ;

        long starsInMilkyWay =2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected "+ (bagOfSweets1 + bagOfSweets2) +"  sweets" );

        System.out.println("There are "+ (starsInAndromeda + starsInMilkyWay) + "stars in the Milky Way and Andromeda galaxies.");

        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test");

        System.out.println(bagOfSweets1*bagOfSweets2);
        System.out.println(testScore*bonusMarks);

        System.out.println(bagOfSweets2/bagOfSweets1);
        System.out.println(testScore/bonusMarks);

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10%2) );
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5%2));


        int counter = 0;

        counter++;
        counter++;
        counter++;

        System.out.println("I count: " + counter);

        counter--; 
        counter--; 
        counter--; 
        System.out.println("I count: " + counter);



    }
    
}


// 

// 

