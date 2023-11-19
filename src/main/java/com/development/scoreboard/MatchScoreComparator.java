package com.development.scoreboard;

import java.util.Comparator;

public class MatchScoreComparator implements Comparator<Match> {
    @Override
    public int compare(Match matchA, Match matchB) {
        int totalScoreA = matchA.getHomeScore() + matchA.getAwayScore();
        int totalScoreB = matchB.getHomeScore() + matchB.getAwayScore();

        int scoreComparison =  Integer.compare(totalScoreB, totalScoreA);

        if (scoreComparison != 0) {
            return scoreComparison;
        } else {
        	// Logic to prioritize the most recently started match
            return -1;
        }
    }
}
