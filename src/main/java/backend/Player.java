package backend;

import java.util.Objects;

public class Player {

    private String name;
    private Move move;

    public Player(String name, Move move) {
        this.name = name;
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(getName(), player.getName()) &&
                Objects.equals(getMove(), player.getMove());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMove());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", move=" + move +
                '}';
    }
}
