import pl.kalinowski.jakub.Figure;
import pl.kalinowski.jakub.Rectangle;
import pl.kalinowski.jakub.Square;

public class Main {

    public static void main(String[] args) {
        Figure kwadrat = new Square("Kwadrat", 5);
        Figure prostokat = new Rectangle("Prostokat", 4, 5);
        Figure[] figures = {kwadrat, prostokat};
        for (Figure figure : figures) {
            System.out.println(figure.getField());
        }
    }
}
