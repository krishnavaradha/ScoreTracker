package com.development.scoreboard;

import java.util.*;

public class MatchLibrary {
	private List<Match> matches;

	public MatchLibrary() {
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
		if (matches.contains(match)) {
			matches.remove(match);
		} else {
			throw new IllegalArgumentException("Match not found in the Match library.");
		}
	}

	public List<Match> getSummary() {
		Collections.sort(matches, new MatchScoreComparator());
		return new ArrayList<>(matches);
	}

}
