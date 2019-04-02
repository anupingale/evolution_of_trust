package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

public class GrudgePlayer implements Playable {
    private List<Moves> moves;
    private int lastScore;

    GrudgePlayer() {
        this.moves = new ArrayList<>();
        this.lastScore = 0;
    }

    @Override
    public Moves getMove(List<Moves> moves) {
        Moves move = Moves.COOPERATE;
        if (moves.contains(Moves.CHEAT)) {
            move = Moves.CHEAT;
        }
        this.moves.add(move);
        return move;
    }

    @Override
    public void updateScore(int score) {
        this.lastScore += score;
    }

    @Override
    public int getScore() {
        return this.lastScore;
    }

    @Override
    public List<Moves> getMoves() {
        return this.moves;
    }
}
