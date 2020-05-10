package com.company;

import java.util.Scanner;

public class check {
    Scanner sc = new Scanner(System.in);

    public void checkBoard(int movesTaken) {
        if (movesTaken == 9) {
            System.out.println("Board is full. Game is a tie.");
            System.exit(0);
        }
    }

    public void checkVictory(String[][] board, int player) {
        //this code might have a simpler implementation
        for (int i = 0; i < 3; i++)
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])
                    && (board[i][0].equals("X") || board[i][0].equals("O"))) {
                System.out.println("Game over, player " + player + " wins");
                System.exit(0);
            } else if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])
                    && (board[0][i].equals("X") || board[0][i].equals("O"))) {
                System.out.println("Game over, player " + player + " wins");
                System.exit(0);
            } else if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])
                    && (board[0][0].equals("X") || board[0][0].equals("O"))) {
                System.out.println("Game over, player " + player + " wins");
                System.exit(0);
            } else if (board[0][2].equals(board[1][1]) && board[0][i].equals(board[2][0])
                    && (board[0][2].equals("X") || board[0][2].equals("O"))) {
                System.out.println("Game over, player " + player + " wins");
                System.exit(0);
            }
    }
}