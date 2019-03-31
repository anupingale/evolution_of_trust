package com.step.evolution_of_trust;

interface Playable {

    Moves getMove();

    void updateScore(int score);

    int getScore();
}
