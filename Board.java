package com.company;

import java.util.Arrays;

public class Board {
    public String[][] replaceNull(String[][] board) {
        for(int x = 0; x<3; x++){
            for(int y = 0; y<3; y++) {
                if (board[x][y] == null) {
                    board[x][y] = "_";
                }
            }
        }
        return board;
    }
    public void printBoard(String[][] board, int rowPosition, int columnPosition, String character) {
        board[rowPosition][columnPosition] = character;
        System.out.println("Move executing...");
        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
    }
}

