package com.step.evolution_of_trust;

import java.util.List;

interface Playable {

    Moves getMove(Playable player);

    void updateScore(int score);

    int getScore();

    List<Moves> getMoves();
}
