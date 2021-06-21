package Marathon;

import Marathon.competitor.Cat;
import Marathon.competitor.Dog;
import Marathon.competitor.Human;
import Marathon.competitor.Team;
import Marathon.course.Course;
import Marathon.course.Cross;
import Marathon.course.Wall;

public class Main {

    public static void main(String[] args) {
        Team team=new Team("A",new Human("Greg"), new Cat("Tom"),new Dog("jeg"));
        Course course=new Course(new Cross(80),new Wall(2),new Wall(1),new Cross(120));
        course.doIt(team);
        team.showWinners();

    }
}
