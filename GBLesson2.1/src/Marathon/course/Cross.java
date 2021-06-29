package Marathon.course;

import Marathon.competitor.Competitior;

public class Cross extends Obstacle{
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitior competitor) {
        competitor.run(length);
    }
}
