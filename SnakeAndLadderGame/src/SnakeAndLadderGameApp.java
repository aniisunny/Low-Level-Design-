package src;

public class SnakeAndLadderGameApp {

    public static void main(String[] args) {

        SpecialEntity snake1 = new Snake(34, 6);
        SpecialEntity snake2 = new Snake(62, 18);
        SpecialEntity snake3 = new Snake(88, 24);
        SpecialEntity snake4 = new Snake(95, 56);

        SpecialEntity ladder1 = new Ladder(28, 74);
        SpecialEntity ladder2 = new Ladder(50, 67);
        SpecialEntity ladder3 = new Ladder(8, 30);
        SpecialEntity ladder4 = new Ladder(72, 91);

        Board board = new Board(10);

        board.addSpecialEntity(snake1);
        board.addSpecialEntity(snake2);
        board.addSpecialEntity(snake3);
        board.addSpecialEntity(snake4);

        board.addSpecialEntity(ladder1);
        board.addSpecialEntity(ladder2);
        board.addSpecialEntity(ladder3);
        board.addSpecialEntity(ladder4);

        Dice dice = new Dice(6);

        Game game = new Game(board, dice);

        Player player1 = new Player("Anii");
        Player player2 = new Player("Rahul");
        Player player3 = new Player("Aniruddha");

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.startGame();
    }
}