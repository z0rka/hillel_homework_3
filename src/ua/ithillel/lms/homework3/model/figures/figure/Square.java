package ua.ithillel.lms.homework3.model.figures.figure;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Square implements Countable {

    private double side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
