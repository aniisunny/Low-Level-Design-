package src;

import java.util.Scanner;

public class SnakeAndLadderGameApp {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Snake and Ladder Game...");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter the size of the board: ");
        int dimensions = sc.nextInt();

        Board board = new Board(dimensions);

        System.out.println("\nPlease enter the number of snakes for the board: ");
        int snakes = sc.nextInt();

        for (int i = 1; i <= snakes; i++) {
            System.out.println("Please enter the head position for the snake" + i + ": ");
            int head = sc.nextInt();

            System.out.println("Please enter the tail position for the snake" + i + ": ");
            int tail = sc.nextInt();

            SpecialEntity snake = new Snake(head, tail);
            board.addSpecialEntity(snake);
        }

        System.out.println("\nPlease enter the number of ladders for the board: ");
        int ladders = sc.nextInt();

        for (int i = 1; i <= ladders; i++) {
            System.out.println("Please enter the start position for the ladder" + i + ": ");
            int start = sc.nextInt();

            System.out.println("Please enter the end position for the ladder" + i + ": ");
            int end = sc.nextInt();

            SpecialEntity ladder = new Ladder(start, end);
            board.addSpecialEntity(ladder);
        }

        System.out.println("\nPlease enter the number of dices: ");
        int maxValue = sc.nextInt() * 6;

        Dice dice = new Dice(maxValue);
        Game game = new Game(board, dice);

        System.out.println("\nPlease enter the number of players: ");
        int players = sc.nextInt();

        for (int i = 1; i <= players; i++) {
            System.out.println("Please enter the name of the player" + i + ": ");
            String str = sc.nextLine();

            Player player = new Player(str);
            game.addPlayer(player);
        }

        System.out.println("\n Let's Play Game...\n");

        game.startGame();
    }
}

// SpecialEntity snake1 = new Snake(34, 6);
// SpecialEntity snake2 = new Snake(62, 18);
// SpecialEntity snake3 = new Snake(88, 24);
// SpecialEntity snake4 = new Snake(95, 56);

// SpecialEntity ladder1 = new Ladder(28, 74);
// SpecialEntity ladder2 = new Ladder(50, 67);
// SpecialEntity ladder3 = new Ladder(8, 30);
// SpecialEntity ladder4 = new Ladder(72, 91);