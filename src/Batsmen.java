public class Batsmen {
    /*
    Setting attributes
    faced balls = 0
    strike rate = 0
    no of sixes = 0
    number of fours = 0
    player score = 0
    player name = ""
     */
    public int facedBalls;
    public int playerScore;
    public double strikeRate;
    public int noSixes;
    public int noFours;
    public String name;

    public Batsmen(String name) {
        this.facedBalls = 0;
        this.playerScore = 0;
        this.strikeRate = 0;
        this.noSixes = 0;
        this.noFours = 0;
        this.name = name;
    }

    public int countBalls() {
        facedBalls += 1;
        return facedBalls;
    }
    public int countSix() {
        noSixes += 1;
        return noSixes;
    }
    public int countFou() {
        noFours += 1;
        return noFours;
    }
    public int countScore(int score) {
        playerScore = playerScore + score;
        return playerScore;
    }


}