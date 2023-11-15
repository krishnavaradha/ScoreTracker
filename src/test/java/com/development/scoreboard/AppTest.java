package com.development.scoreboard;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private MatchLibrary matchLibrary;
    /**
     * Rigorous Test :-)
     */
    @Before
    public void setUp() {
        matchLibrary = new MatchLibrary();
    }

    @Test
    public void testCreateMatch() {
        String homeTeam = "Home Team";
        String awayTeam = "Away Team";
        int initialScore = 0;
        Match match = matchLibrary.createMatch(homeTeam, awayTeam);
        assertEquals(homeTeam, match.getHomeTeam());
        assertEquals(awayTeam, match.getAwayTeam());
        assertEquals(initialScore, match.getHomeScore());
        assertEquals(initialScore, match.getAwayScore());
    }

    @Test
    public void testUpdateScore()
    {
        String homeTeam = "Home Team";
        String awayTeam = "Away Team";
        int homeScore = 2;
        int awayScore = 1;
        Match match = matchLibrary.createMatch(homeTeam, awayTeam);
        matchLibrary.updateScore(match, homeScore, awayScore);
        assertEquals(homeScore, match.getHomeScore());
        assertEquals(awayScore, match.getAwayScore());
    }

    @Test
    public void testFinishGame()
    {
        String homeTeam = "Home Team";
        String awayTeam = "Away Team";
        int homeScore = 2;
        int awayScore = 1;
        Match match = matchLibrary.createMatch(homeTeam, awayTeam);
        matchLibrary.updateScore(match, homeScore, awayScore);
        matchLibrary.finishGame(match);
        assertFalse(matchLibrary.getSummary().contains(match));
    }

    public Match createMatch(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Match match = new Match(homeTeam, awayTeam);
        match.setHomeScore(homeScore);
        match.setAwayScore(awayScore);
        return match;
    }

    @Test
    public void testGetSummary()
    {
        // match A
        Match matchA = matchLibrary.createMatch("Mexico", "Canada");
        matchLibrary.updateScore(matchA, 0, 5);

        // match B
        Match matchB = matchLibrary.createMatch("Spain", "Brazil");
        matchLibrary.updateScore(matchB, 10, 2);

        // match C
        Match matchC = matchLibrary.createMatch("Germany", "France");
        matchLibrary.updateScore(matchC, 2, 2);

        // match D
        Match matchD = matchLibrary.createMatch("Uruguay", "Italy");
        matchLibrary.updateScore(matchD, 6, 6);

        // match E
        Match matchE = matchLibrary.createMatch("Argentina", "Australia");
        matchLibrary.updateScore(matchE, 3, 1);

        List<Match> expectedMatchScores = Arrays.asList(
                createMatch("Uruguay", "Italy", 6, 6),
                createMatch("Spain", "Brazil", 10, 2),
                createMatch("Mexico", "Canada", 0, 5),
                createMatch("Argentina", "Australia", 3, 1),
                createMatch("Germany", "France", 2, 2)
        );

        assertArrayEquals(matchLibrary.getSummary().toArray(), expectedMatchScores.toArray());

    }





}
