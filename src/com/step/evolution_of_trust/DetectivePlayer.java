package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

public class DetectivePlayer implements Playable {
    private int lastScore;
    private int moveCount;
    private List<Moves> MyMoves;
    private List<Moves> moves;

    DetectivePlayer() {
        this.lastScore = 0;
        moveCount = 0;
        this.moves = new ArrayList<>();
        this.MyMoves = new ArrayList<>();
        this.MyMoves.add(Moves.COOPERATE);
        this.MyMoves.add(Moves.CHEAT);
        this.MyMoves.add(Moves.COOPERATE);
        this.MyMoves.add(Moves.COOPERATE);
        this.MyMoves.add(Moves.COOPERATE);
    }


    @Override
    public Moves getMove(Playable player) {
        List<Moves> moves = player.getMoves();
        Moves move = this.MyMoves.get(moveCount);
        if(moves.size() > 3){
            move = Moves.CHEAT;
            if(moves.contains(Moves.CHEAT)) {
                move = moves.get(moves.size() -1);
            }
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
