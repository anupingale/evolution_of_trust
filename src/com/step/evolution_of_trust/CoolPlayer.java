package com.step.evolution_of_trust;

class CoolPlayer implements Playable {
    private int lastScore = 0;

    public Moves getMove() {
        return Moves.COOPERATE;
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
