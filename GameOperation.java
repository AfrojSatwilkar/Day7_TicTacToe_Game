package com.company1.Day7_TicTacToe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameOperation {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    
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

    public void placePiece(char [][] gameBoard ,int pos , String user) {
        char symbol = ' ';
        if(user.equals("player1")) {
            symbol = this.player;
            playerPositions.add(pos);
        }else if(user.equals("cpu")) {
            symbol = this.pc;
            cpuPositions.add(pos);
        }


        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public void gameMain(char [][] gameBoard) {

        while(true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number between 1-9 :");
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("position taken! Enter aonther position");
                playerPos = scan.nextInt();
            }
            placePiece(gameBoard, playerPos, "player1");
            printGameBoard(gameBoard);

            System.out.println("==============================");

            Random random = new Random();
            int cpuPos = random.nextInt(9) +1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = random.nextInt(9) +1;
            }
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);


        }
    }
}
