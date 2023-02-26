import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.

            char[][] board ={
              {'_','_','_'},
              {'_','_','_'},
              {'_','_','_'}
            };

            //Task 2: Call the function printBoard();





             int turn = 0;
             printBard(board);

              while (turn<9){
                

                if(turn%2==0){
                  System.out.print("Player 1 move: ");
                  int[] move = askUser(board);
                  board[move[0]][move[1]]='X';
                  System.out.println("\n Turn: " + (turn+1) +"\n");
                  printBard(board);
                      if (checkWin(board)==1){
                        System.out.println("Player1 wins.");
                        System.out.println("Exiting the game.");
                        System.exit(0);
                      }
                  turn++;
                } else {
                  System.out.print("Player 2 move: ");
                  int[] move = askUser(board);
                  board[move[0]][move[1]]='O';
                  System.out.println("\n Turn: " + (turn+1) +"\n");
                  printBard(board);
                      if (checkWin(board)==1){
                        System.out.println("Player2 wins.");
                        System.out.println("Exiting the game.");
                        System.exit(0);
                      }
                  turn++;
                }
               
              }

              System.out.println("Its a tie!");

              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */
            
              scan.close();   
        }
        
        


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        

      public static void printBard(char[][]board){

        System.out.print("\n Board: \n");
        for (int i = 0 ; i < board.length; i++){
            for (int j = 0 ; j<board[i].length; j++){
              System.out.print("\t" + board[i][j] + " ");
            }

            System.out.print("\n\n");
        }
      }

   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */


      public static int[] askUser (char[][] board){

        int row = scan.nextInt()-1;
        int column = scan.nextInt()-1;
        
        while (board[row][column]!='_'){
          System.out.print("Spot taken, choose again: ");
          row = scan.nextInt()-1;
          column = scan.nextInt()-1;
        }
        return new int[] {row, column};
      }
      

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */

     public static int checkWin (char[][]board){
      for (int i = 0 ; i<board.length ; i++){
        if(board[i][0]=='X' && board[i][1]=='X' && board[i][2]=='X'){
          return 1;}
        if(board[i][0]=='O' && board[i][1]=='O' && board[i][2]=='O'){
          return 1;}
      }

      for (int j = 0 ; j<board.length ; j++){
        if(board[0][j]=='X' && board[1][j]=='X' && board[2][j]=='X'){
          return 1;}
        if(board[0][j]=='O' && board[1][j]=='O' && board[2][j]=='O'){
          return 1;}    
      }
        if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
          return 1;}        
        if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O'){
          return 1;} 
          
          
        if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'){
          return 1;}        
        if(board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O'){
          return 1;}     
      

      return 0;
     }

}
