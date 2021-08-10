package com.bridgelabz;
/**
<<<<<<< HEAD
 * Purpose : To create a Tic Tac Toe Game
=======
 * Purpose : To create a Tic Tac Toe Game Board
>>>>>>> UC1_CreateBoard
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-10
 * */
public class TicTacToeGame {
    public static char[] board;

    /**
     * This is the main method which makes use of createBoard method
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To TIC-TAC-TOE Game");
        board = createBoard();
    }

    /**
     * This method implements to create a TicTacToe board
     *
     * @return board This returns the TicTacToe board
     * @index This is used for initializing the index for iteration from 1 to 9
     * and stores the empty space
     */
    public static char[] createBoard() {
        board = new char[10];
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }
}
