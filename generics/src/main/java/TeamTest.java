public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckman = new SoccerPlayer("Beckman");

//        Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");

//        Team<String> brokenTeam = new Team<>("this is not going to work");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckman);

        System.out.println(liverpool.numPlayers());



    }

}
