package src;

import java.util.Queue;
import java.util.ArrayDeque;

public class Game {

    Board board;
    Dice dice;
    GameStatus status;
    Queue<Player> players;

    public Game(Board board, Dice dice) {

        this.dice = dice;
        this.board = board;
        status = GameStatus.NOT_STARTED;
        players = new ArrayDeque<Player>();
        
    }

    public void startGame() {

        this.status = GameStatus.RUNNING;
        board.printBoard();
        
        while (players.size() > 1) {
            Player player = players.poll();
            
            makeMove(player);

            if (player.getPosition() == board.getTotalCells()) {
                System.out.println(player.getPlayerName() + " has completed the game!");
            }
            else {
                players.offer(player);
            }
        }

        this.status = GameStatus.FINISHED;
    }

    public void makeMove(Player player) {

        int oldPosition = player.getPosition();
        int newPosition = oldPosition + dice.rollDice();
        int totalCells = board.getTotalCells();

        if(newPosition > totalCells) {
            System.out.println("Invalid move");
            newPosition = oldPosition;
        } 
        else if (board.hasSpecialEntity(newPosition)) {

            SpecialEntity specialEntity = board.getspecialEntityPosition(newPosition);

            if (specialEntity instanceof Snake) {
                System.out.println("Snake at position :" + newPosition);
            } 
            else {
                System.out.println("Ladder at position :" + newPosition);
            }
            
            newPosition = specialEntity.getEndPosition();
        }

        player.setPosition(newPosition);
    }

    public void addPlayer(Player player) {

        players.offer(player);
    }

    public void setPlayers(Queue<Player> players) {

        this.players = players;
    }
}