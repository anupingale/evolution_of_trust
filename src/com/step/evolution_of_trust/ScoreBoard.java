package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ScoreBoard {

    private List<Record> records;

    ScoreBoard() {
        this.records = new ArrayList<>();
    }

    void addRecord(Record record) {
        this.records.add(record);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreBoard that = (ScoreBoard) o;
        return Objects.equals(records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }
}
