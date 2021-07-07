package Marathon.course;

import Marathon.competitor.Competitior;

public class Wall extends Obstacle{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitior competitor) {
        competitor.jump(height);
    }
}
