package com.step.evolution_of_trust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void shouldReturnTheScoreBetweenCheatAndCoolPlayer() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        CoolPlayer coolPlayer = new CoolPlayer();
        Game game = new Game(coolPlayer, cheatPlayer);
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addRecord(new Record(1, -1, 3));
        scoreBoard.addRecord(new Record(2, -2, 6));
        scoreBoard.addRecord(new Record(3, -3, 9));
        scoreBoard.addRecord(new Record(4, -4, 12));
        scoreBoard.addRecord(new Record(5, -5, 15));
        assertEquals(scoreBoard, game.getScoreBoard());
    }

    @Test
    void shouldReturnTheScoreBetweenCheatAndCopyCatPerson() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        Game game = new Game(copyCatPlayer, cheatPlayer);
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addRecord(new Record(1, -1, 3));
        scoreBoard.addRecord(new Record(2, -1, 3));
        scoreBoard.addRecord(new Record(3, -1, 3));
        scoreBoard.addRecord(new Record(4, -1, 3));
        scoreBoard.addRecord(new Record(5, -1, 3));
        assertEquals(scoreBoard, game.getScoreBoard());
    }

    @Test
    void shouldReturnTheScoreBetweenCopyCatAndGrudgerPlayer() {
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        GrudgePlayer grudgePlayer = new GrudgePlayer();
        Game game = new Game(copyCatPlayer, grudgePlayer);
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.addRecord(new Record(1, 2, 2));
        scoreBoard.addRecord(new Record(2, 4, 4));
        scoreBoard.addRecord(new Record(3, 6, 6));
        scoreBoard.addRecord(new Record(4, 8, 8));
        scoreBoard.addRecord(new Record(5, 10, 10));
        assertEquals(scoreBoard, game.getScoreBoard());
    }
}