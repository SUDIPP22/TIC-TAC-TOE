package com.bridgelabz;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome To TIC-TAC-TOE Game");
        getBoard();   // calling method
    }
        public static void getBoard() {
        char[] board = new char[10];
        for (int i=1;i<= board.length;i++) {
            board[i] = ' ';
        }
    }
}
