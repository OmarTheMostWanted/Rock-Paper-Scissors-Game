package backend;

import java.util.Objects;

public class Player {

    private String name;
    private Move move;

    public Player(String name) {
        this.name = name;
        this.move = null;
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Player player = (Player) object;
        return Objects.equals(getName(), player.getName())
                && Objects.equals(getMove(), player.getMove());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMove());
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", move=" + move + '}';
    }
}
