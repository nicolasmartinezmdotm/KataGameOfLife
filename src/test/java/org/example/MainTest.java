package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MainTest {
    Main.GameOfLife gameOfLife = new Main.GameOfLife();;

    @Test
    void checkIfThereIsABoard() {
        String result = gameOfLife.GameOfLife();

        assertEquals("""
                ........
                ........
                ........
                ........
                """, result);
    }
}