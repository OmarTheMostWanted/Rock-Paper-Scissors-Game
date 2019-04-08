package frontend;

import backend.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player(args[0]);
//        Player player2 = new Player(args[1]);
        Player player1 = new Player("p1");
        Player player2 = new Player("p2");
        Paper paper = new Paper();
        Rock rock = new Rock();
        Scissors scissors = new Scissors();


        Game game = new Game(player1, player2);

        System.out.println(game);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int a = scanner.nextInt();

            if (a == 1) {
                player1.setMove(new Move(rock));
            }
            if (a == 2) {
                player1.setMove(new Move(paper));
            }
            if (a == 3) {
                player1.setMove(new Move(scissors));
            }
            if (a == 0) {
                System.out.println(game.getWinner());
                scanner.close();
                System.exit(0);
            }

            int b = scanner.nextInt();

            if (b == 1) {
                player2.setMove(new Move(rock));
            }
            if (b == 2) {
                player2.setMove(new Move(paper));
            }
            if (b == 3) {
                player2.setMove(new Move(scissors));
            }
            if (b == 0) {

                System.out.println(game.getWinner());
                scanner.close();
                System.exit(0);
            }

            System.out.println("Played Game");
            game.playGame();

            System.out.println(game);

        }

    }

}
