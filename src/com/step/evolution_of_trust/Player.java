package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private List<Moves> playerMoves;
    private int moveCount;

    Player(String name) {
        this.name = name;
        playerMoves = new ArrayList();
        this.moveCount = 0;
    }

    void playMove(Moves move) {
        this.playerMoves.add(move);
        this.moveCount++;
    }

    int getScore() throws InvalidMoveException {
        int score = 0;
        if(this.moveCount > 5) throw new InvalidMoveException();
        for (Moves move : playerMoves) {
            if (move == Moves.COOPERATE) {
                score += 2;
            } else {
                score += 3;
            }
        }
        return score;
    }
}
