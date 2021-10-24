package com.company1.Day7_TicTacToe;

import java.util.Random;

public class TicTacToeGame {
    public static void main(String[] args) {
        GameOperation gameOperation = new GameOperation();
        char [][] gameBoard = {{' ','|',' ','|',' ' },
                              {'-','+','-','+','-' },
                              {' ','|',' ','|',' ' },
                              {'-','+','-','+','-' },
                              {' ','|',' ','|',' ' }};
        gameOperation.chooseLetter();
        gameOperation.printGameBoard(gameBoard);
        Random random = new Random();
        int firstMove = random.nextInt(2);
        if (firstMove == 0) {
            System.out.println("computer move");
            int cpuPos = random.nextInt(9) +1;
            gameOperation.placePiece(gameBoard, cpuPos, "cpu");
            gameOperation.printGameBoard(gameBoard);

        } else {
            System.out.println("player move");
        }
        gameOperation.gameMain(gameBoard);
    }
}
