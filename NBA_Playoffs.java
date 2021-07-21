//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Wed July 14
//Homework 7
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java .util.*;
class NBA_Playoff extends JFrame implements ActionListener {
    private final JTextField txt_Name;//creates the variables
    private final JTextField text_Age;
    private final NBA_Team spurs;
    private final NBA_court_Panel court;
    private final JLabel label_Max_Age_Value;
    private final JLabel label_Minimum_Age_Value;
    private final JLabel label_average_Age_Value;
    private final JLabel labelNum_Players_Value;
    private final JButton jbutton_AddPlayer;
    private final JButton jbutton_clear;

    public NBA_Playoff() {
        this.setSize(900, 500);//draws the panel
        JPanel compl_Panel = new JPanel(new BorderLayout(25, 25));//draws the border
        spurs = new NBA_Team("Spurs");
        court = new NBA_court_Panel(spurs);//team name
        compl_Panel.add(court, BorderLayout.CENTER);
        JLabel lblabelNum_Players_ValuePlayers = new JLabel("Number of Players: ");//gets number of players
        labelNum_Players_Value = new JLabel("");
        JLabel lblabel_Max_Age_Value = new JLabel("Max Age: ");//gets max age
        label_Max_Age_Value = new JLabel("");
        JLabel lblabel_Minimum_Age_Value = new JLabel("Min Age: ");//gets minimum age
        label_Minimum_Age_Value = new JLabel("");
        JLabel lblabel_average_Age_Value = new JLabel("Average Age:");//gets average age
        label_average_Age_Value = new JLabel("");
        JPanel r_Panel = new JPanel(new GridLayout(8, 1));//grid layout
        r_Panel.add(lblabelNum_Players_ValuePlayers);
        r_Panel.add(labelNum_Players_Value);//gets player value
        r_Panel.add(lblabel_Max_Age_Value);
        r_Panel.add(label_Max_Age_Value);//gets max age
        r_Panel.add(lblabel_Minimum_Age_Value);
        r_Panel.add(label_Minimum_Age_Value);//gets minimum age
        r_Panel.add(lblabel_average_Age_Value);
        r_Panel.add(label_average_Age_Value);//gets average age
        compl_Panel.add(r_Panel, BorderLayout.EAST);
        JLabel lblPlayerName = new JLabel("Player Name:");//player name
        txt_Name = new JTextField();
        txt_Name.setPreferredSize(new Dimension(120, 24));//size of panel
        JLabel lblPlayerAge = new JLabel("Player Age:");//player age
        text_Age = new JTextField();
        text_Age.setPreferredSize(new Dimension(120, 24));//dimensions of the panel
        jbutton_AddPlayer = new JButton("Add A Player");//adds a player
        jbutton_clear = new JButton("Clear");
        jbutton_AddPlayer.addActionListener(this);
        jbutton_clear.addActionListener(this);
        JPanel bPanel = new JPanel();
        bPanel.add(lblPlayerName);
        bPanel.add(txt_Name);//adds name
        bPanel.add(lblPlayerAge);
        bPanel.add(text_Age);//adds age
        bPanel.add(jbutton_AddPlayer);//adds player
        bPanel.add(jbutton_clear);//clears
        compl_Panel.add(new JLabel("   "), BorderLayout.WEST);
        compl_Panel.add(bPanel, BorderLayout.SOUTH);
        add(compl_Panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {//main class
        NBA_Playoff frame = new NBA_Playoff();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//checks the action event
        if (jbutton_AddPlayer == e.getSource()) {
            int age = Integer.parseInt(text_Age.getText());
            spurs.addAPlayer(txt_Name.getText(), age);
            labelNum_Players_Value.setText(spurs.getNumOfPlayer() + "");
            label_Max_Age_Value.setText(spurs.get_Maximum_Age() + "");
            label_Minimum_Age_Value.setText(spurs.getmin_Age() + "");
            label_average_Age_Value.setText(spurs.getAvgAge() + "");
            court.updateNBA_Team(spurs);
            court.repaint();
        }
        if (jbutton_clear == e.getSource()) {
            txt_Name.setText("");//gets the source
            text_Age.setText("");
        }
    }

    static class NBAPlayer {//nba player
        String name1;
        int age1;

        public String get_Name() {
            return name1;
        }

        public void set_Name(String name1) {
            this.name1 = name1;
        }//sets the name

        public int get_Age() {
            return age1;
        }//sets the age

        public void set_Age(int age1) {
            this.age1 = age1;
        }//sets the age

        public NBAPlayer() {
            this.name1 = "";
            this.age1 = 0;
        }

        public NBAPlayer(String name1, int age1) {
            this.name1 = name1;
            this.age1 = age1;
        }
    }

    class NBA_court_Panel extends JPanel {//the court panel
        Graphics g;
        JPanel p;//creates the variables
        NBA_Team spurs;

        public NBA_court_Panel(NBA_Team spurs) {
            this.spurs = spurs;
        }//the court panel method

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);//draws the panel
            Graphics2D graph2_dim = (Graphics2D) g.create();
            int width1 = this.getWidth() - 50;
            int height1 = this.getHeight() - 50;
            int x1 = ((this.getWidth() - width1) / 2);
            int y1 = ((this.getHeight() - height1) / 2);
            graph2_dim.setColor(Color.ORANGE);
            graph2_dim.fillRect(x1, y1, width1, height1);
            graph2_dim.setColor(Color.RED);
            graph2_dim.fillOval(x1 + width1 / 2 - (height1 / 2) + 45, y1 + 50, height1 - 90, height1 - 90);
            graph2_dim.setColor(Color.YELLOW);
            graph2_dim.drawLine(x1 + width1 / 2, y1, x1 + width1 / 2, y1 + height1);
            graph2_dim.drawArc(x1 - (height1 / 2) + 30, y1 + 40, height1 - 50, height1 - 80, 90, -180);
            graph2_dim.drawArc(x1 + width1 / 2 + height1 / 2, y1 + 40, height1 - 50,
                    height1 - 80, -90, -180);
            graph2_dim.setFont(new Font("TimesRoman", Font.PLAIN, 16));
            graph2_dim.setColor(Color.BLACK);
            int yPos1 = y1 + 100;
            int xPos1 = x1 + width1 / 2 + 80 + height1 / 2;
            ArrayList<NBAPlayer> players = spurs.getNbaPlayers();
            for (int i = 0; i < players.size(); i++) {
                graph2_dim.drawString(players.get(i).get_Name(), xPos1, yPos1 + (i * 20));
            }
        }

        public void updateNBA_Team(NBA_Team spurs) {
            this.spurs = spurs;
        }
    }

    class NBA_Team {//the NBA team method
        ArrayList<NBAPlayer> nbaPlayers;
        int min_Age;//sets the variables for each of the attributes
        int max_Age;
        int total_Age;
        int average_Age;
        String teamName;
        public NBA_Team() {
            teamName = "";//the NBA team
            nbaPlayers = new ArrayList<>();
            min_Age = 9999;
            max_Age = 0;
            total_Age = 0;
            average_Age = 0;
        }
        public NBA_Team(String teamName) {
            this.teamName = teamName;
            nbaPlayers = new ArrayList<>();
            min_Age = 9999;
            max_Age = 0;//the NBA team name
            total_Age = 0;
            average_Age = 0;
        }

        public ArrayList<NBAPlayer> getNbaPlayers() {
            return nbaPlayers;
        }
        public int getmin_Age() {
            return min_Age;//gets minimum age
        }
        public int get_Maximum_Age() {
            return max_Age;//gets max age
        }

        public int getAvgAge() {
            return average_Age;//gets average age
        }
        public void addAPlayer(String playerName, int age) {
            nbaPlayers.add(new NBAPlayer(playerName, age));
            if (age < min_Age)//adds the player
                min_Age = age;
            if (age > max_Age)
                max_Age = age;
            total_Age += age;
            average_Age = total_Age / nbaPlayers.size();
        }
        public int getNumOfPlayer() {
            return nbaPlayers.size();//gets the number of players
        }
    }
}
