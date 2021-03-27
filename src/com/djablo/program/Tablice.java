package com.djablo.program;

public class Tablice {

    public static void main(String[] args) {

        String[] tydzien = new String[7];
        tydzien[0] = "poniedziałek";
        tydzien[1] = "wtorek";
        tydzien[2] = "środa";
        tydzien[3] = "czwartek";
        tydzien[4] = "piątek";
        tydzien[5] = "sobota";
        tydzien[6] = "niedziela";

    String[] week = new String[]     {"monday", "thu","wed", "thur", "fri"};

        System.out.println(tydzien.length);
        System.out.println(week.length);

        String[][] tictactoeBoard = new String[3][3];

        tictactoeBoard[0][0] = "O";
        tictactoeBoard[0][1] = "X";
        tictactoeBoard[0][2] = "O";
        tictactoeBoard[1][0] = "X";
        tictactoeBoard[1][1] = "O";
        tictactoeBoard[1][2] = "X";
        tictactoeBoard[2][0] = "O";
        tictactoeBoard[2][1] = "X";
        tictactoeBoard[2][2] = " ";

        System.out.println(" _____________");
        System.out.println(" | "+ tictactoeBoard[0][0] + " | " +  tictactoeBoard[0][1] + " | " +  tictactoeBoard[0][2] + " | ");
        System.out.println(" | "+ tictactoeBoard[1][0] + " | " +  tictactoeBoard[1][1] + " | " +  tictactoeBoard[1][2] + " | ");
        System.out.println(" | "+ tictactoeBoard[2][0] + " | " +  tictactoeBoard[2][1] + " | " +  tictactoeBoard[2][2] + " | ");
        System.out.println(" _____________");

    int[][] irregularArray = new int[3][];

        irregularArray[0] = new int[3];
        irregularArray[1] = new int[5];
        irregularArray[2] = new int[2];

        irregularArray[0][0] = 00;
        irregularArray[0][1] = 01;
        irregularArray[0][2] = 02;
        irregularArray[1][0] = 10;
        irregularArray[1][1] = 11;
        irregularArray[1][2] = 12;
        irregularArray[1][3] = 13;
        irregularArray[1][4] = 14;
        irregularArray[2][0] = 20;
        irregularArray[2][1] = 21;

        for (int i=0;i<irregularArray.length;i++){
            for (int j=0;j<irregularArray[i].length;j++){
                System.out.println(irregularArray[i][j]);
            }
        }
    }
}
