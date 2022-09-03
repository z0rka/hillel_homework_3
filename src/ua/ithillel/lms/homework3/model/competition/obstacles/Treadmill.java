package ua.ithillel.lms.homework3.model.competition.obstacles;

import ua.ithillel.lms.homework3.model.competition.api.Competitor;
import ua.ithillel.lms.homework3.model.competition.api.Overcoming;

public class Treadmill implements Overcoming {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        return competitor.run(length);
    }
}
