package marathon;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[]{
                new Road(8),
                new Wall(2),
                new Water(1),
                new Wall(2)

        });
        Team team = new Team("Red team",new Competitor[]{
                new Dog("Jack", "black", 10, 1, 2),
                new Cat("Mag", "white", 10, 0, 3),
                new Turtle("Turtle", "green", 100, 10, 0),
                new Human("Rick", 8, 10, 2)
        });
        c.doIt(team);
        team.showResults();
        System.out.println();
        team.infoTeam();
    }
}
