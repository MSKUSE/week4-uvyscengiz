
/**
 * A simple Tic-Tac-Toe game implementation in Java.
 */
public class TicTacToe {

    /**
     * The main method to run the Tic-Tac-Toe game.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // TODO: Initialize the game board and scanner
        // TODO: Print the initial game board
        // TODO: Prompt the current player for their move
        // TODO: Update the board with the player's move
        // TODO: Handle invalid move
        // TODO: Check if the game has ended

        char[][] board = new char[][]{
            {'x', 'o', 'x'},
            {'o', 'x', 'o'},
            {'x', 'o', 'x'}
        };

        printBoard(board);

        int validMoves = 0;
        boolean isGameOver = false;

    }

    /**
     * Checks if the current player has won the game.
     *
     * @param board The game board.
     * @param row The row of the last move.
     * @param col The column of the last move.
     * @return True if the current player has won, false otherwise.
     */
    public static boolean checkboard(char[][] board, int row, int col) {
        char symbol = board[row][col];

        boolean isWin = true;

        // Check if the row is xxx
        for (int i = 0; i < 3; i++) {
            if (board[row][i] != symbol) {
                isWin = false;
                break;
            }
        }

        if (isWin) {
            return true;
        }

        // Check if the column is x\nx\nx
        for (int i = 0; i < 3; i++) {
            if (board[i][col] != symbol) {
                isWin = false;
                break;
            }
        }

        if (isWin) {
            return true;
        }

        if (row == col) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != symbol) {
                    isWin = false;
                    break;
                }
            }
        } else if (row + col == 2) {
            for (int i = 0; i < 3; i++) {
                if (board[i][2 - i] != symbol) {
                    isWin = false;
                    break;
                }
            }
        }

        if (isWin) {
            return true;
        }

        return isWin;
    }

    /**
     * Prints the current state of the game board.
     *
     * @param board The game board.
     */
    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("  +---+---+---");
        for (int row = 0; row < 3; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < 3; col++) {
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
            }
            System.out.println();
        }
        // TODO: Implement the logic to print the game board
    }

    /**
     * Validates if the given row and column are within the valid range.
     *
     * @param row The row number.
     * @param col The column number.
     * @return True if the row and column are valid, false otherwise.
     */
    public static boolean isValid(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3);
    }
}
