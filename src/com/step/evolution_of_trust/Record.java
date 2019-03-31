package com.step.evolution_of_trust;

import java.util.Objects;

class Record {
    private final int round;
    private final int player1Score;
    private final int player2Score;

    Record(int round, int player1Score, int player2Score) {
        this.round = round;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return round == record.round &&
                player1Score == record.player1Score &&
                player2Score == record.player2Score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(round, player1Score, player2Score);
    }
}
