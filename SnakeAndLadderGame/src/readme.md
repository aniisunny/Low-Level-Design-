Snake and Ladder Game

Gathering Requirements: 

Create a multiplayer Snake and Ladder game in such a way that the game should take input N from the user at the start of the game to create a board of size N x N. The board should have some snakes and ladders placed randomly in such a way the snake will have its head position at a higher number than the tail and ladder will have start position at smaller number than end position. Also, No ladder and snake create a cycle and no snake tail position has a ladder start position & vice versa.

The players take their turn one after another and during their turn, they roll the dice to get a random number and the player has to move forward that many positions. If the player ends up at a cell with the head of the snake, the player has to be punished and should go down to the cell that contains the tail of the same snake & If the player ends up at a cell with the start position of a ladder, the player has to be rewarded and should climb the ladder to reach the cell which has a top position of the ladder. Initially, each player is outside of the board (at position 0). If at any point of time, the player has to move outside of the board (say player at position 99 on a 100 cell board and dice rolls give 4) the player stays at the same position.

Possible future extension:

The game can be played by more than one dice. (i.e. if there are two dices then the numbers from 2 to 12 will be generated).
On getting a 6, you get another turn and on getting 3 consecutive 6s, all three of those get cancelled.