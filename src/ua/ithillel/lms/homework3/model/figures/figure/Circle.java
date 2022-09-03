package ua.ithillel.lms.homework3.model.figures.figure;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Circle implements Countable {

    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
