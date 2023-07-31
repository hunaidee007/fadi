package football;

public class Team {

    private Player[] players;

    int numberOfRedCards;

    int numberOfYellowCards;

    public Team(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }
}
