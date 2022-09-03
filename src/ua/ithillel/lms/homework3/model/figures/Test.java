package ua.ithillel.lms.homework3.model.figures;

import ua.ithillel.lms.homework3.model.figures.api.Countable;
import ua.ithillel.lms.homework3.model.figures.figure.Circle;
import ua.ithillel.lms.homework3.model.figures.figure.Square;
import ua.ithillel.lms.homework3.model.figures.figure.Triangle;

import static ua.ithillel.lms.homework3.model.figures.Counter.areaCounter;

public class Test {

    public static void main(String[] args) {

        Countable[] figures = new Countable[3];

        for (int i = 0; i < figures.length; i += 3) {
            figures[i] = new Circle(3);
            figures[i + 1] = new Square(5);
            figures[i + 2] = new Triangle(2,4);
        }

        System.out.println("Total area of all the figures = " + areaCounter(figures, figures.length));
    }
}
