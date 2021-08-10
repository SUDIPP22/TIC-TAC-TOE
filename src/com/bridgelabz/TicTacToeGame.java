package com.bridgelabz;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome To TIC-TAC-TOE Game");
        char[] board= getBoard();   // calling method
    }

    public static char[] getBoard() {
        char[] board = new char[10];
        // loop execution
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';       // assigning empty space
        }
        return board;
    }
}
