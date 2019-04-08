package backend;

public class Scissors extends Choice {
    private String name;

    public Scissors() {
        this.name = "Scissors";
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "name='" + name + '\'' +
                '}';
    }
}
