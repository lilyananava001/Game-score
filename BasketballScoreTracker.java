import java.util.Scanner;
public class BasketballScoreTracker {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE BASKETBALL SCORE TRAKER");
        System.out.print("ENTER THE FIRST TEAM NAME: ");
        String name1 = input.nextLine();
        System.out.print("ENTER SECOND TEAM NAME: ");
        String name2 = input.nextLine();

        Team team1 = new Team(name1);
        Team team2 = new Team (name2);

        Game game = new Game();

        for (int i = 1; i <=4; i++) {
            System.out.println("\nQuarter" + i);
            System.out.print("points for" + name1 + ": ");
            int points1 = input.nextInt();
            System.out.print("points for" + name2 + ": ");
            int points2 = input.nextInt();

            game.recordPoints(team1, points1);
            game.recordPoints(team2, points2);
        }
        System.out.println("\n==== FINAL SCOREBOARD ====");
        System.out.println("sport: " + Game.sportName);

        team1.displayInfo();
        team2.displayInfo();

        System.out.println("\n==== GAME RESULT ====");

        Game.determineWinner(team1, team2);

        System.out.println("Game Played: " + Game.gamesPlayed);

        input.close();
    }
}
