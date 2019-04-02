package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

public class DetectivePlayer implements Playable {
    private int lastScore;
    private int moveCount;
    private List<Moves> defaultMoves;
    private List<Moves> moves;

    DetectivePlayer() {
        this.lastScore = 0;
        this.moveCount = 0;
        this.moves = new ArrayList<>();
        this.defaultMoves = new ArrayList<>();
        this.defaultMoves.add(Moves.COOPERATE);
        this.defaultMoves.add(Moves.CHEAT);
        this.defaultMoves.add(Moves.COOPERATE);
        this.defaultMoves.add(Moves.COOPERATE);
        this.defaultMoves.add(Moves.COOPERATE);
    }


    @Override
    public Moves getMove(List<Moves> moves) {
        Moves move = this.defaultMoves.get(moveCount);
        if (moves.size() > 3) {
            move = Moves.CHEAT;
            if (moves.contains(Moves.CHEAT)) move = moves.get(moves.size() - 1);
        }
        moveCount++;
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
