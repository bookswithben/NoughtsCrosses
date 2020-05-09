import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

    static char[][] board = new char[][]{{'O','X','O'},{'X','O','X'},{'X','O','O'}};

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
            if (winningColumn(board) == 'X' || winningRows(board) == 'X' || winningDiagonal(board) == 'X'){
                return 'X';
            } else if (winningColumn(board) == 'O' || winningRows(board) == 'O' || winningDiagonal(board) == 'O'){
                return 'O';
            }
        }
        return '.';
    }

    public static char winningRows(char [][] board) {
        for (int i = 0; i < 3; i++) {
            if (checkWin(board[i][0], board[i][1], board[i][2]) == 'X') {
                return 'X';
            } else if (checkWin(board[i][0], board[i][1], board[i][2]) == 'O') {
                return 'O';
            }
        }
        return '.';
    }

    public static char winningColumn(char [][] board) {
        for (int i = 0; i < 3; i++) {
            if (checkWin(board[0][i], board[1][i], board[2][i]) == 'X') {
                return 'X';
            } else if (checkWin(board[0][i], board[1][i], board[2][i]) == 'O') {
                return 'O';
            }
        }
        return '.';
    }

    public static char winningDiagonal(char [][] board) {
        for (int i = 0; i < 3; i++) {

            if ((checkWin(board[0][0], board[1][1], board[2][2])) == 'X' || (checkWin(board[0][2], board[1][1], board[2][0])) == 'X') {
                return 'X';
            } else if ((checkWin(board[0][0], board[1][1], board[2][2])) == 'O' || (checkWin(board[0][2], board[1][1], board[2][0])) == 'O') {
                return 'O';
            }
        }
        return '.';
    }

    public static char checkWin(char a, char b, char c) {
            if  ((a != '.') && (a == b) && (b == c)) {
                return a;
            }
            return '.';
    }





    // Write a method that when given a board layout returns a new
    // board where a random move has been made depending on whose
    // move it is. Other return values will be needed if a draw has been
    // attained [for example].


}
