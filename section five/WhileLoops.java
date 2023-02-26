public class WhileLoops {

    public static void main(String[] args) {
        

        double choice = 0.5;
        double guess = 0.1; 

        while(guess <= choice){           
            guess = Math.random();
            System.out.println(guess);
        }
    }
    
}
