package com.company;

public class Main {

    public static void main(String[] args) {
        check move = new check();
        Board manageBoard = new Board();
        acquire check = new acquire();
        String[][] board = new String[3][3];
        int rowPosition;
        int columnPosition;
        int player = 1;
        String character = "X";
        int movesTaken = 0;

        while (true) {
            move.checkBoard(movesTaken);
            String input = check.acquireInput(player);

            if(input.length() != 2) {
                System.out.println("Enter valid move");
                continue;
            }

            String[]in = input.split("");

            switch(in[0]) {
                case "a":
                    rowPosition = 0;
                    break;
                case "b":
                    rowPosition = 1;
                    break;
                case "c":
                    rowPosition = 2;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }

            switch(in[1]) {
                case "1":
                    columnPosition = 0;
                    break;
                case "2":
                    columnPosition = 1;
                    break;
                case "3":
                    columnPosition = 2;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            board = manageBoard.replaceNull(board);
            if(!(board[rowPosition][columnPosition].equals("_"))) {
                System.out.println("Space already taken.");
                continue;
            }
            manageBoard.printBoard(board, rowPosition, columnPosition, character);
            move.checkVictory(board, player);
            player = check.acquireNextPlayer(player);
            character = check.getCharacter();
            movesTaken++;
        }
    }
}