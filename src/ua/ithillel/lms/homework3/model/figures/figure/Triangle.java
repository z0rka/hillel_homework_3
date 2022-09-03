package ua.ithillel.lms.homework3.model.figures.figure;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Triangle implements Countable {

    private double height;
    private double weight;

    public Triangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (weight * height);
    }
}
