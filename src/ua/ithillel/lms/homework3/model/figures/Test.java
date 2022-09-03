package ua.ithillel.lms.homework3.model.figures;

import ua.ithillel.lms.homework3.model.figures.api.Countable;
import ua.ithillel.lms.homework3.model.figures.figure.Circle;
import ua.ithillel.lms.homework3.model.figures.figure.Square;
import ua.ithillel.lms.homework3.model.figures.figure.Triangle;

import static ua.ithillel.lms.homework3.model.figures.Counter.areaCounter;

public class Test {

    public static void main(String[] args) {

        Countable[] figures = new Countable[21];

        for (int i = 0; i < figures.length; i += 3) {
            figures[i] = new Circle(10);
            figures[i + 1] = new Square(10);
            figures[i + 2] = new Triangle(10);
        }

        System.out.println("Total area of all the figures = " + areaCounter(figures, figures.length));
    }
}
