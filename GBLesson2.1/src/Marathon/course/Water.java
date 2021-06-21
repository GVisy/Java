package Marathon.course;

import Marathon.competitor.Competitior;

public class Water extends Obstacle{
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitior competitor) {
        competitor.swim(length);
    }
}
