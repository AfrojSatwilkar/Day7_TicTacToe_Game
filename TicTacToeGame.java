package com.company1.Day7_TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    //initilized variables
    public char[] gameBoard = new char[10];
    public boolean checkInitilize = true;

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
                    System.out.println("___ ___ ___");
                }
            }
        }
    }
}
