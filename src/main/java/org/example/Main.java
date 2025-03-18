package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    static class GameOfLife {
        public String GameOfLife() {
            boolean[][] board = new boolean[4][8];

            board[1][4] = true;
            board[2][3] = true;
            board[2][4] = true;

            String output = "";

            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    if (board[row][col]) {
                        output += "*";
                    } else {
                        output += ".";
                    }
                }
                output += "\n";
            }

            return output;
        }
    }
}