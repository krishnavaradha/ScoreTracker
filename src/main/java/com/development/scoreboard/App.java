package com.development.scoreboard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start the Game!" );
        MatchLibrary matchLibrary = new MatchLibrary();
        // match A
        Match matchA = matchLibrary.createMatch("Mexico", "Canada");
        matchLibrary.updateScore(matchA, 0, 5);

        // match B
        Match matchB = matchLibrary.createMatch("Spain", "Brazil");
        matchLibrary.updateScore(matchB, 10, 2);

        // match C
        Match matchC = matchLibrary.createMatch("Germany", "France");
        matchLibrary.updateScore(matchC, 2, 2);

        // match d
        Match matchD = matchLibrary.createMatch("Uruguay", "Italy");
        matchLibrary.updateScore(matchD, 6, 6);

        // match e
        Match matchE = matchLibrary.createMatch("Argentina", "Australia");
        matchLibrary.updateScore(matchE, 3, 1);

        // matchLibrary.finishGame(matchD);

        for (Match match: matchLibrary.getSummary()) {
            System.out.println(match.getHomeTeam() + " " + match.getHomeScore()
                        + " - " +
                    match.getAwayTeam() + " " + match.getAwayScore());
        }

    }
}
