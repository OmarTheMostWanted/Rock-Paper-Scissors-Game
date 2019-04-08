package backend;

public class Move {

    private Choice choice;

    public Move(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Move{" + "choice=" + choice + '}';
    }
}
