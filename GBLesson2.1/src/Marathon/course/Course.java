package Marathon.course;

import Marathon.competitor.Competitior;
import Marathon.competitor.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle...obstacles){
        this.obstacles=obstacles;
    }
    public void doIt(Team team){
        for (Competitior c:team.getMembers()){
            for (Obstacle o:obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
