package backend;

public class Paper extends Choice {

    private String name;

    public Paper() {
        this.name = "Paper";
    }

    @Override
    public String toString() {
        return "Paper{" + "name='" + name + '\'' + '}';
    }
}
