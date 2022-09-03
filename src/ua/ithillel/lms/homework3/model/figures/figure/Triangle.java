package ua.ithillel.lms.homework3.model.figures.figure;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Triangle implements Countable {

    private int area;

    public Triangle(int area) {
        this.area = area;
    }

    @Override
    public int getArea() {
        return area;
    }
}
