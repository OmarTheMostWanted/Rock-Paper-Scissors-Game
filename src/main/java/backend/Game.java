package backend;

public class Game {

    private Player player1;
    private Player player2;
    private int roundCount;
    private int player1result;
    private int player2result;


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

    public Player chooseWinner () {

        if (player1.getMove().getChoice().equals(player2.getMove().getChoice())){
            return null;
        }

        if (player1.getMove().getChoice() instanceof Paper && player2.getMove().getChoice() instanceof Rock){

            this.setPlayer1result(this.getPlayer1result() + 1);
            return player1;
        }
        if (player1.getMove().getChoice() instanceof Rock && player2.getMove().getChoice() instanceof Scissors){
            this.setPlayer1result(this.getPlayer1result() + 1);
            return player1;
        }
        if (player1.getMove().getChoice() instanceof Scissors && player2.getMove().getChoice() instanceof Paper){
            this.setPlayer1result(this.getPlayer1result() + 1);
            return player1;
        }
        this.setPlayer2result(this.getPlayer2result() + 1);
        return player2;
    }

}
