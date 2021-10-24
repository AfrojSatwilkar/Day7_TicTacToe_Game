package com.company1.Day7_TicTacToe;

public class TicTacToeGame {
    public static void main(String[] args) {
        GameOperation gameOperation = new GameOperation();
        char [][] gameBoard = {{' ','|',' ','|',' ' },
                              {'-','+','-','+','-' },
                              {' ','|',' ','|',' ' },
                              {'-','+','-','+','-' },
                              {' ','|',' ','|',' ' }};
        gameOperation.printGameBoard(gameBoard);
    }
}
