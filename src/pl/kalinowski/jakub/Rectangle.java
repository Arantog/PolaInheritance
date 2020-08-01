package pl.kalinowski.jakub;

public class Rectangle extends Figure {
    int x1;
    int x2;

    public Rectangle(String name, int x1, int x2) {
        super(name);
        this.x1 = x1;
        this.x2 = x2;

    }

    @Override
    public int getField() {
        return x1 * x2;
    }
}
