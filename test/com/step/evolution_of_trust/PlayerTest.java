package com.step.evolution_of_trust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {
    @Test
    void shouldReturnTheScoreOfTheCurrentMove() throws InvalidMoveException {
        Player player = new Player("anu");
        player.playMove(Moves.COOPERATE);
        int score = player.getScore();
        assertEquals(2, score);
    }

    @Test
    void shouldReturnTheScoreAfterAnyMove() throws InvalidMoveException {
        Player player = new Player("anu");
        player.playMove(Moves.COOPERATE);
        player.playMove(Moves.CHEAT);
        assertEquals(5,player.getScore());
    }

    @Test
    void shouldNotAllowPlayerToPlayMoreThanFiveMoves() {
        Player anu = new Player("anu");
        anu.playMove(Moves.COOPERATE);
        anu.playMove(Moves.COOPERATE);
        anu.playMove(Moves.COOPERATE);
        anu.playMove(Moves.COOPERATE);
        anu.playMove(Moves.COOPERATE);
        anu.playMove(Moves.COOPERATE);
        assertThrows(InvalidMoveException.class, () -> anu.getScore());
    }


}