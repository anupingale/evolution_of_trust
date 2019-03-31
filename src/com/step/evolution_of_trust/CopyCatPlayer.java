package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

public class CopyCatPlayer implements Playable {
    private List<Moves> moves;
    private int lastScore;

    CopyCatPlayer() {
        this.moves = new ArrayList<>();
        this.lastScore = 0;
    }

    @Override
    public Moves getMove(Playable player) {
        List<Moves> playerMoves = player.getMoves();
        Moves move = Moves.COOPERATE;
        if (playerMoves.size() > 0) {
            move = playerMoves.get(playerMoves.size() - 1);
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
