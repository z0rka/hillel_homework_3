package ua.ithillel.lms.homework3.model.competition;

import ua.ithillel.lms.homework3.model.competition.api.Competitor;
import ua.ithillel.lms.homework3.model.competition.api.Overcoming;
import ua.ithillel.lms.homework3.model.competition.competitors.Cat;
import ua.ithillel.lms.homework3.model.competition.competitors.Human;
import ua.ithillel.lms.homework3.model.competition.competitors.Robot;
import ua.ithillel.lms.homework3.model.competition.obstacles.Treadmill;
import ua.ithillel.lms.homework3.model.competition.obstacles.Wall;

public class Test {

    public static void startCompetition(Competitor[] competitors, Overcoming[] obstacles) {

        for (int i = 0; i < competitors.length; i++) {
            System.out.println("----------------------------------------------");
            for (int j = 0; j < obstacles.length; j++)
                if (!obstacles[j].overcome(competitors[i]))
                    break;
        }

    }

    public static void main(String[] args) {

        Competitor[] competitors = new Competitor[9];

        competitors[0] = new Cat("Johan", 100, 5);
        competitors[1] = new Cat("Graph", 1000, 2);
        competitors[2] = new Cat("Cat", 500, 7);
        competitors[3] = new Human("Maks", 1000, 5);
        competitors[4] = new Human("Kosta", 600, 5);
        competitors[5] = new Human("Mark", 300, 5);
        competitors[6] = new Robot("R2D2", 400, 0);
        competitors[7] = new Robot("R2D3", 200, 4);
        competitors[8] = new Robot("R2D4", 1000, 10);

        Overcoming[] obstacles = new Overcoming[4];

        obstacles[0] = new Treadmill(100);
        obstacles[1] = new Treadmill(1000);
        obstacles[2] = new Wall(4);
        obstacles[3] = new Wall(3);

        startCompetition(competitors,obstacles);

    }
}
