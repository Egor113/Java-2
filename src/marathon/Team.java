package marathon;

public class Team {
    private String teamName; //Имя команды
    private Competitor[] competitors; //Массив участников

    public Team(String teamName, Competitor[] competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public String getTeamName() {
        return teamName;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    //метод для вывода информации о членах команды, прошедших дистанцию
    public void showResults(){
        System.out.println("В команде \"" + teamName + "\" прошли дистанцию:");
        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i].onDistance()){
                competitors[i].info();
            }
        }
    }

    //метод вывода информации обо всех членах команды
    public void infoTeam(){
        System.out.println("Участники команды \"" + teamName + "\":");
        for (Competitor c :competitors
             ) {
            c.info();
        }
    }
}
