package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    static class GameOfLife {
        public String GameOfLife() {
            boolean[][] board = new boolean[4][8];

            String output = "";

            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    output += ".";
                }
                output += "\n";
            }

            return output;
        }
    }
}