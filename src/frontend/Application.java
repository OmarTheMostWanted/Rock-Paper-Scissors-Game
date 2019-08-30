package frontend;

import backend.*;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Player player1 = new Player("p1");
        Player player2 = new Player("p2");

        Game game = new Game(player1, player2);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            doMove(player1, game, scanner);
            doMove(player2, game, scanner);

            System.out.println("Played Game");
            game.playGame();

            System.out.println(game);
        }

    }

    private static void doMove(Player player, Game game, Scanner scanner) {
        int r = scanner.nextInt();

        switch (r){
            case 1:
                player.setMove(Move.ROCK);
                break;
            case 2:
                player.setMove(Move.PAPER);
                break;
            case 3:
                player.setMove(Move.SCISSORS);
                break;
            case 0:
                System.out.println(game.getWinner());
                scanner.close();
                System.exit(0);
                break;
        }
    }

}
