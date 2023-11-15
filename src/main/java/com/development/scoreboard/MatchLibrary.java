package com.development.scoreboard;

import java.util.*;

public class MatchLibrary {
    private List<Match> matches;
    public MatchLibrary(){
        this.matches = new ArrayList<>();
    }

    public Match createMatch(String homeTeam, String awayTeam) {
        Match match = new Match(homeTeam, awayTeam);
        matches.add(match);
        return match;
    }

    public void updateScore(Match match, int homeScore, int awayScore) {
        match.setHomeScore(homeScore);
        match.setAwayScore(awayScore);
    }

    public void finishGame(Match match) {
        matches.remove(match);
    }

    public List<Match> getSummary() {
        // List<Match> matchList = new ArrayList<>(matches);
        Collections.sort(matches, new MatchComparator());
        return matches;
    }

}
