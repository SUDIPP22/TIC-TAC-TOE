package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : To create a Tic Tac Toe Game Board and
 * allow player choosing an option between X or O.
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-10
 */
public class TicTacToeGame {
    public static char[] board;
    public static char playerChoice;
    public static char computerChoice;

    /**
     * This is the main method which makes use of createBoard method and
     * playerTurn method
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To TIC-TAC-TOE Game");
        Scanner sc = new Scanner(System.in);
        board = createBoard();
        playerTurn(sc);
    }

    /**
     * This method implements to create a TicTacToe board
     *@index This is used for initializing the index for iteration from 1 to 9
     * and stores the empty space
     * @return board This returns the TicTacToe board
     */
    public static char[] createBoard() {
        board = new char[10];
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }

    /**
     * This method implements player choose between X or O
     * @param sc This is the first parameter to playerTurn method
     */
    public static void playerTurn(Scanner sc) {
        System.out.println("CHOOSE AN OPTION X or O ");
        char option = sc.next().charAt(0);
        if (option == 'X') {
            playerChoice = 'X';
            computerChoice = 'O';
        } else if (option == 'O') {
            computerChoice = 'O';
            playerChoice = 'X';
        } else
            System.out.println("PLEASE ENTER A VALID OPTION");
    }
}
