package com.company1.Day7_TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    //initilized variables
    public char[] gameBoard = new char[10];
    public boolean checkInitilize = true;
    public char player;
    public char pc;

    //UC1 case is for empty array design pattern
    public void UC1Case() {
        int count = 0;
        int design = 0;
        int countTwo = 0;

        if (checkInitilize == true) {
            for (int i = 0; i < gameBoard.length; i++) {
                gameBoard[i] = ' ';
            }
            checkInitilize = false;
        }

        for (int i = 0; i < gameBoard.length - 1; i++) {

            System.out.print(" " + gameBoard[i] + " ");

            if (design < 2) {
                System.out.print("|");
                design++;
            } else {
                design = 0;
            }

            count++;
            if (count == 3) {
                System.out.print("\n");
                count = 0;
                countTwo++;
                if (countTwo <= 2) {
                    System.out.println("--- --- ---");
                }
            }
        }
    }

    //UC2 case is for user choice X or O
    public void UC2Case() {
        System.out.print("Choose X or O : ");
        Scanner scanInput = new Scanner(System.in);
        char getUserInput = scanInput.next().charAt(0);

        if (getUserInput == 'X' || getUserInput == 'O') {
            if (getUserInput == 'X') {
                this.player = 'X';
                this.pc = 'O';
            } else {
                this.player = 'O';
                this.pc = 'X';
            }
        } else {
            System.out.println("wrong input");
            UC2Case();
        }
        System.out.print("Player select - " + this.player + " and PC select - " + this.pc);

    }
}
