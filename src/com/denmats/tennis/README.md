Task 1 - Java - Tennis Game

Write a program which can be used to track the score of a tennis game.
- The program will track a game of singles, where there are 2 players.
  These are the server and the receiver.
- We would like to see the score once a player wins a point.
- We should be alerted when there is a winner.
- The application should be a console app which prompts the user for the player that wins the next point.

Example of UI:
"Server = 1"
"Receiver = 2"
"Please enter the player that wins the point: "


Requirements:

As a system user I want to see the score increment correctly once a player wins a point.
- Given the score is 0:0, when the server wins a point Then the score is 15:0.
- Given the score is 0:0 when the receiver wins a point Then the score is 0:15.
- Given the score is 15:15 when the server wins a point Then the score is 30:15.
- Given the score is 30:30 when the receiver wins a point then the score is 30:40.

As a system user I want to see winner be declared correctly.
- Given the score is 40:30 when the server wins the they are declared the winner.
- Given the score is 40:A when the receiver wins the point they are declared the winner.

As a system user I want to see deuce and advantage scored correctly
- Given the score is 40:40, when the server wins a point then the score should be A:40.
- Given the score is A:40, when the receiver wins a point then the score should be 40:40

The program should be written using test driven development.
We are looking for the solution to be well factored and to adhere to the SOLID principles.