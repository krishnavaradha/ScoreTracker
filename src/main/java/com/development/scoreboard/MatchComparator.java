package com.development.scoreboard;

import java.util.Comparator;

public class MatchComparator implements Comparator<Match> {
    @Override
    public int compare(Match gameA, Match gameB) {
        int totalScoreA = gameA.getHomeScore() + gameA.getAwayScore();
        int totalScoreB = gameB.getHomeScore() + gameB.getAwayScore();

        int scoreComparison =  Integer.compare(totalScoreB, totalScoreA);

        if (scoreComparison != 0) {
            return scoreComparison;
        } else {
            return -1;
        }
    }
}
