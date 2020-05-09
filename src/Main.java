import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    static char[][] board = new char[][]{{'X','X','O'},{'O','O','O'},{'X','O','X'}};

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        System.out.println(validASquare('O'));
        System.out.println(validASquare('3')+ "\n");

        System.out.println("Question 2: ");
        System.out.println(countingABoard(board, 'O') + "\n");

        System.out.println("Question 3: ");
        System.out.println(validGameBoard(board) + "\n");

        System.out.println("Question 4: ");
        System.out.println(winningBoard(board) + "\n");
    }



    // Write a method that when given a single character [see above] as a
    // parameter returns true/false depending on whether it is a valid
    // game character.
    // Marks: 1
    public static Boolean validASquare(char input) {
        if (input == 'O' || input == '.' || input == 'X') {
            return true;
        }
        return false;
    }


    // Write a method that when given a board layout and a game
    // character, returns the number of times this character appears on
    // the board.
    // Marks: 2
    public static int countingABoard(char[][] board, char input) {
        int a = 0;
            for (char[] singleArray : board) {
                for (char character : singleArray) {

                    if (character == input) {
                        a++;
                    }
                }

            }
            return a;
    }

    // Write a method that when given a board layout returns true/false
    // depending on whether it is a valid game board. Note that a board
    // consisting all of "O" (nine/9) [for example] may be valid in terms of
    // the permitted characters but is NOT a valid game board.
    // Marks: 3

    public static Boolean validGameBoard (char[][] board) {

        int amountX = countingABoard(board, 'X');
        int amountO = countingABoard(board, 'O');
        int difference = amountX - amountO;

        if (difference >= -1 && difference <= 1) {
            return true;
        }

        return false;


    }

    // Write a method that when given a board layout returns a value
    // indicating whether "O" or "X" has won, if there is no winner another
    // value will be needed to be returned. Other return values will also
    // be needed.
    // Marks: 4

    public static char winningBoard (char[][] board) {
        if (validGameBoard(board)) {
            int amountX = countingABoard(board, 'X');
            int amountO = countingABoard(board, 'O');


        }
        return '.';
    }

    public static void winningrows(char [][] board) {

    }




    // Write a method that when given a board layout returns a new
    // board where a random move has been made depending on whose
    // move it is. Other return values will be needed if a draw has been
    // attained [for example].


}
