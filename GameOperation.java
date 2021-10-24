package com.company1.Day7_TicTacToe;

import java.util.Scanner;

public class GameOperation {
    
    public static void printGameBoard(char [][] gameBoard) {
        for(char[] row :gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public char player;
    public char pc;
    public void chooseLetter() {
        System.out.print("Enter for player X or O : ");
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
            chooseLetter();
        }
        System.out.println("player select - " + this.player + " pc select - " + this.pc);
    }
}
