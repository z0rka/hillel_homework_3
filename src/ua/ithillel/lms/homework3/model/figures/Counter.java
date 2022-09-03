package ua.ithillel.lms.homework3.model.figures;

import ua.ithillel.lms.homework3.model.figures.api.Countable;

public class Counter {
    private static double sumCounter;

    public static double areaCounter(Countable countable[], int i) {
        while (i > 0) {
            i--;
            sumCounter += countable[i].getArea();
        }
        return getSumCounter();
    }

    private static double getSumCounter() {
        return sumCounter;
    }
}
