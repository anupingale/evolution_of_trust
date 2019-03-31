package com.step.evolution_of_trust;

public class CheatPlayer implements Playable {
    private int lastScore = 0;

    @Override
    public Moves getMove() {
        return Moves.CHEAT;
    }

    @Override
    public void updateScore(int score) {
        this.lastScore += score;
    }

    @Override
    public int getScore() {
        return this.lastScore;
    }
}
