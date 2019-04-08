package backend;

public class Rock extends Choice {

    private String name;

    public Rock() {
        this.name = "Rock";
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name='" + name + '\'' +
                '}';
    }
}
