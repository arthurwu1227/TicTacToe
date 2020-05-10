package com.company;

import java.util.Scanner;

public class acquire {
    Scanner sc = new Scanner(System.in);
    private String character;
    public String acquireInput(int player) {
        System.out.println("It's player " + player + "'s turn");
        System.out.println("Enter move, example a1");

        return sc.nextLine();
    }
    public int acquireNextPlayer(int player){
        //I'm sure there is a simpler implementation of determining whether a player is 1 or 2, but I'm too lazy
        //to implement it right now
        if(player == 1){
            player = 2;
            character = "O";
            }
        else {
            player -= 1;
            character = "X";
        }
        return player;
        }

    public String getCharacter(){
        return character;
    }
    }

