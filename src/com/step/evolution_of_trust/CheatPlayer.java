package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

public class CheatPlayer implements Playable {
    private int lastScore;
    private List<Moves> moves;

    CheatPlayer() {
        this.lastScore = 0;
        this.moves = new ArrayList<>();
    }

    @Override
    public Moves getMove(Playable player) {
        Moves move = Moves.CHEAT;
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
        System.out.println(this.moves);
        return this.moves;
    }
}
