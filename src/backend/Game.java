package backend;

public class Game {

    private Player player1;
    private Player player2;
    private int roundCount;
    private int player1result;
    private int player2result;

    /**
     * constructor takes two players and initialize the game.
     *
     * @param player1 player one
     * @param player2 player two
     */
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.roundCount = 0;
        this.player1result = 0;
        this.player2result = 0;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public int getPlayer1result() {
        return player1result;
    }

    public void setPlayer1result(int player1result) {
        this.player1result = player1result;
    }

    public int getPlayer2result() {
        return player2result;
    }

    public void setPlayer2result(int player2result) {
        this.player2result = player2result;
    }

    /**
     * checks the winners on current round.
     */
    public void playGame() {

        try {

            this.setRoundCount(this.getRoundCount() + 1);
            if(player1.getMove() == player2.getMove()) {
                //No score affected
            }
            else if(player1.getMove() == Move.PAPER && player2.getMove() == Move.ROCK ||
                    player1.getMove() == Move.ROCK && player2.getMove() == Move.SCISSORS ||
                    player1.getMove() == Move.SCISSORS && player2.getMove() == Move.PAPER){
                this.setPlayer1result(this.getPlayer1result() + 1);
            }
            else{
                this.setPlayer2result(this.getPlayer2result() + 1);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(this);
        }
    }

    /**checks the winner with the highest score.
     *
     * @return winner or default incas of a draw
     */
    public Player getWinner() {
        if (this.player1result > this.player2result) {
            return player1;
        }
        if (this.player1result < this.player2result) {
            return player2;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Game{"
                + "player1=" + player1 + ", player2=" + player2
                + ", roundCount="
                + roundCount + ", player1result="
                + player1result + ", player2result=" + player2result + '}';
    }
}
