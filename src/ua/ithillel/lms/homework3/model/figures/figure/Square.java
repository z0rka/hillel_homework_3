package ua.ithillel.lms.homework3.model.figures.figure;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Square implements Countable {

    private int area;

    public Square(int area) {
        this.area = area;
    }

    @Override
    public int getArea() {
        return area;
    }
}
