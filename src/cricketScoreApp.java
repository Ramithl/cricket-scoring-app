import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.*;




public class cricketScoreApp extends JFrame {
    private JPanel mainPanel;
    public JLabel mainScore;
    private JButton scoreOne;
    private JButton btnWicket;
    private JButton scoreFour;
    private JButton scoreSix;
    private JButton scoreTwo;
    private JButton scoreThree;
    private JButton btnNoBall;
    private JButton btnWide;
    private JLabel playerSR;
    private JTextField addPlayers;
    private JButton btnAddPlayers;


    int totalScore = 0; //Starting value of total score
    int wickets = 0; // starting value of wickets
    int i = 0; // variable to count added players (used in "Add players" Button


    void displayScore(int x, int y){
        playerSR.setText(String.valueOf((x/(batsmenList[i].countBalls()))*100)); //Display Strike Rate
        mainScore.setText(x+"/"+y);  //Display Score and Wickets
    }



    Batsmen[] batsmenList = new Batsmen[11];

    public cricketScoreApp(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();



        scoreOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalScore = totalScore + 1;
                displayScore(totalScore,wickets);

            }
        });
        btnWicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wickets = wickets + 1;
                displayScore(totalScore,wickets);
            }
        });
        scoreFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalScore = totalScore + 4;
                displayScore(totalScore,wickets);
            }
        });
        scoreSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalScore = totalScore + 6;
                displayScore(totalScore,wickets);
            }
        });


        btnAddPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getText = addPlayers.getText();
                batsmenList[i] = new Batsmen(getText);


            }
        });
    }

    public static void main(String[] args) {
        JFrame Frame = new cricketScoreApp("Cricket Score App");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 2 / 3;
        int width = screenSize.width * 2 / 3;
        Frame.setPreferredSize(new Dimension(width,height));
        Frame.pack();
        Frame.setVisible(true);










    }

}
