# ScoreTracker
##Overview
This Java application serves as a simple scoreboard for tracking and managing sports matches. It allows the creation of matches, updating scores, finishing games, and retrieving a summary of matches sorted by total scores.

##Getting Started
To run the application, follow these steps:

##Prerequisites
Java Development Kit (JDK) installed on your machine.
Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.

Clone the Repository
git clone https://github.com/krishnavaradha/ScoreTracker.git

Open in IDE
Open the project in your preferred IDE (IntelliJ IDEA recommended) by importing the existing project.

Run the Application
Locate the App class and run it. This class contains the main method and serves as the entry point to the application.

##Usage
The application starts by displaying "Start the Game!" in the console.
The MatchLibrary is instantiated to manage matches.
Sample matches (A, B, C, D, E) are created with home and away teams.
Scores are updated for each match using the updateScore method.
Optionally, a match can be finished using the finishGame method (currently commented out in the example).
The getSummary method is called to display a summary of matches sorted by total scores.The matches with the same total score will be returned ordered by the most recently started match in the scoreboard.

##Components

1. App Class
Entry point to the application.
Demonstrates the functionality of the MatchLibrary.
2. Match Class
Represents a sports match with details such as home team, away team, and scores.
Implements equals and hashCode for proper comparison.
3. MatchLibrary Class
Manages a collection of matches.
Allows the creation, updating, and finishing of matches.
Provides a summary of matches sorted by total scores.
4. MatchComparator Class
Compares matches based on total scores.
Used for sorting matches in descending order.
