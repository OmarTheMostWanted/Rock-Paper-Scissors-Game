package frontend;

import backend.*;

public class main {

    public static void main(String[] args) {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        Paper paper = new Paper();
        Rock rock = new Rock();
        Scissors scissors = new Scissors();


        player1.setMove(new Move(paper));
        player1.setMove(new Move(rock));

        Game game = new Game(player1 , player2);

        System.out.println(game);

        System.out.println("=============== play game");

        System.out.println(game);

    }

}
