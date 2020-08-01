package pl.kalinowski.jakub;

import java.util.Scanner;

public class Square extends Figure {
    private int x;

    public Square(String name, int x) {
        super(name);
        this.x = x;
    }

    @Override
    public int getField() {

        return x * x;
    }

}
