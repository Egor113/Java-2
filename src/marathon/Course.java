package marathon;

public class Course {
    private Obstacle [] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < team.getCompetitors().length; j++) {
                obstacles[i].doIt(team.getCompetitors()[j]);
            }
        }
    }
}
