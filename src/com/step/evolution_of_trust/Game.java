package com.step.evolution_of_trust;

class Game {
    private final Playable player1;
    private final Playable player2;

    Game(Playable player1, Playable player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    ScoreBoard getScoreBoard() {
        RuleEngine ruleEngine = new RuleEngine();
        ScoreBoard scoreBoard = new ScoreBoard();
        for (int round = 1; round <= 5; round++) {
            Record record = ruleEngine.getResult(round, this.player1, this.player2);
            scoreBoard.addRecord(record);
        }
        return scoreBoard;
    }

}
