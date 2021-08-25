public class Batsmen {

    public int balls;
    public String name;

    public Batsmen(String name){
        balls = 0;
        this.name = name;
    }

    public int countBalls(){

        balls += 1;
        System.out.println(balls);
        return balls;

    }
    public static double myMethod(double score, double balls) {
        return (score/balls) * 100;
    }
}