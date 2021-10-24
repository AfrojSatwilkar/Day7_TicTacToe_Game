package com.company1.Day7_TicTacToe;

import java.util.*;

public class GameOperation extends Game{
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

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
            String result=checkWinner();
            if(result.length()>0) {
                System.out.println(result);
                break;
            }

            System.out.println("==============================");

            Random random = new Random();
            int cpuPos = random.nextInt(9) +1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = random.nextInt(9) +1;
            }
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);
            result= checkWinner();
            if(result.length()>0) {
                System.out.println(result);
                break;
            }

        }
    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);

        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);

        List leftDig = Arrays.asList(1,5,9);
        List rightDig = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(leftDig);
        winning.add(rightDig);

        for(List l : winning) {
            if(playerPositions.containsAll(l)) {
                return "Congo you winnnn!!!!! THANK YOU:)";
            }else if(cpuPositions.containsAll(l)) {
                return "CPU won!! Better Luch Next Time :)";
            }else if(playerPositions.size() + cpuPositions.size() == 9) {
                return "Tie...";
            }
        }

        return "";

    }
}
