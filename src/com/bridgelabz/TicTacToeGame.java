package com.bridgelabz;

import java.util.Random;
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
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    /**
     * This is the main method which makes use of createBoard method,
     * showBoard method, chooseOption method, checkFirstPlayer method and
     * isSpaceFree method.
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.println("Welcome To TIC-TAC-TOE Game");
        board = createBoard();
        showBoard();
        System.out.println("Choose An Option between X or O ");
        char choice = sc.next().charAt(0);
        chooseOption(choice);
        checkFirstPlayer();

        //userPlay(sc);
        /*
        * This condition indicates if free space  is available on the board
        * then user will be making desired move
         */
        if (isSpaceFree(board, 9))
            userPlay(sc);
        sc.close();
    }

    /**
     * This method implements to create a TicTacToe board
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

    /**
     * This method implements player choose between X or O
     * @return player choice
     */
    public static char chooseOption(char choice) {
        if (choice == 'X') {
            playerChoice = 'X';
            computerChoice = 'O';
        } else if (choice == 'O') {
            computerChoice = 'X';
            playerChoice = 'O';
        } else
            System.out.println("PLEASE ENTER A VALID OPTION");
        return playerChoice;
    }

    /**
     * This showBoard method will be displaying the current board
     */
    public static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("--+-+-+--");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("--+-+-+--");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    /**
     * This userPlay method indicates the ability for user to
     * make a move to a desired location in the board
     * @param sc this parameter takes the input from 1 to 9 by user
     */
    public static void userPlay(Scanner sc) {
        System.out.println("Please select Number (1-9) ");
        int playerMove = sc.nextInt();
        switch (playerMove) {
            case 1:
                board[1] = playerChoice;
                break;
            case 2:
                board[2] = playerChoice;
                break;
            case 3:
                board[3] = playerChoice;
                break;
            case 4:
                board[4] = playerChoice;
                break;
            case 5:
                board[5] = playerChoice;
                break;
            case 6:
                board[6] = playerChoice;
                break;
            case 7:
                board[7] = playerChoice;
                break;
            case 8:
                board[8] = playerChoice;
                break;
            case 9:
                board[9] = playerChoice;
                break;
            default:
                System.out.println("Invalid Move");
        }
        showBoard();
    }

    /**
     * This computerPlay method indicates the ability for computer to
     * make a move randomly in the board
     */
    public static void computerPlay() {
        int computerPlay = random.nextInt(9) + 1;
        if (board[computerPlay] == ' ') {
            switch (computerPlay) {
                case 1:
                    board[1] = computerChoice;
                    break;
                case 2:
                    board[2] = computerChoice;
                    break;
                case 3:
                    board[3] = computerChoice;
                    break;
                case 4:
                    board[4] = computerChoice;
                    break;
                case 5:
                    board[5] = computerChoice;
                    break;
                case 6:
                    board[6] = computerChoice;
                    break;
                case 7:
                    board[7] = computerChoice;
                    break;
                case 8:
                    board[8] = computerChoice;
                    break;
                case 9:
                    board[9] = computerChoice;
                    break;
            }
        }
        showBoard();
    }

    /**
     * This isSpaceFree method indicates ability for checking the free space on the board
     * @param board This is the first parameter to isSpaceFree method
     * @param index This is the second parameter to isSpaceFree method
     * @return This returns the free space
     */
    public static boolean isSpaceFree(char[] board, int index) {
        return board[index] == ' ';
    }

    /**
     * This method is used to determine who will play first
     */
    public static void checkFirstPlayer() {
        int user = random.nextInt(2);
        int computer = random.nextInt(2);
        if (user == 0) {
            System.out.println("User Got The First Chance");
            userPlay(sc);
            System.out.println("Now The Board is : ");
            computerPlay();
        } else if (computer == 0) {
            System.out.println("Computer Got The First Chance");
            computerPlay();
            userPlay(sc);
        }
    }
}

