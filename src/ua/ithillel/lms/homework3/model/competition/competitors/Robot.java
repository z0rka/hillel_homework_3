package ua.ithillel.lms.homework3.model.competition.competitors;

import ua.ithillel.lms.homework3.model.competition.api.Competitor;

public class Robot implements Competitor {

    private String name;
    private int runLength;
    private int jumpHeight;

    public Robot(String name, int runLength, int jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;

    }

    @Override
    public boolean run(int length) {
        System.out.println("run");

        if (runLength >= length) {
            System.out.println("Competitor " + name + " passed obstacle 'Treadmill' on distance " + length);
            return true;
        }
        System.out.println("Competitor " + name + " has not passed the obstacle 'Treadmill' on distance " + length +
                " . Passed " + runLength);
        return false;
    }

    @Override
    public boolean jump(int height) {
        System.out.println("jump");

        if (jumpHeight >= height) {
            System.out.println("Competitor " + name + " passed obstacle 'Wall' on height " + height);
            return true;
        }
        System.out.println("Competitor " + name + " has not passed the obstacle 'Wall' on height " + height +
                " . Jumped only on  " + jumpHeight);
        return false;
    }
}
