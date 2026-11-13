public class Team {
    String name;
    int score;

    public Team(String teamName) {
        name = teamName;
        score = 0;
    }
    public void addPoints(int points) {
        score = score + points;
    }
    public void displayInfo() {
        System.out.println(name + ":" + score + "points");
    }
}
