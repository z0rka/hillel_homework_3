package ua.ithillel.lms.homework3.model.competition.obstacles;

import ua.ithillel.lms.homework3.model.competition.api.Competitor;
import ua.ithillel.lms.homework3.model.competition.api.Overcoming;

public class Wall implements Overcoming {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        return competitor.jump(height);
    }
}
