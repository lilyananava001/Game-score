public class Game {
    static String sportName = "Basketball";
    static int gamesPlayed = 0;

    public Game() {
        gamesPlayed++;
    }

    public void recordPoints(Team team, int points) {
        team.addPoints(points);
    }
    public static void determineWinner(Team team1, Team team2) {

        if (team1.score > team2.score) {
            System.out.println("winner:" + team2.name);
        }
        else {
            System.out.println("The game is a tie");
        }
    }
}
