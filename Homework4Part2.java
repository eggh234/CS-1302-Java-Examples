//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri July 6th
//Homework 4 part 2
import java.util.*;
public class Homework4Part2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String ifAddPlayer;
            String playerName;
            System.out.println("Create team Spurs");//creates the team Spurs
            NBATeam Spurs = new NBATeam("Spurs");
            System.out.print("Add a player to Spurs? (yes / no): ");//asks if user wants to add player
            ifAddPlayer = input.next();
            while (ifAddPlayer.equalsIgnoreCase("yes")) {
                System.out.print("What is the name: ");//asks the user for the name
                playerName = input.next();
                Spurs.addAPlayer(playerName);//adds the player to the team
                System.out.print("Add another player to Spurs? (yes / no) : ");//asks if the user wants another player
                ifAddPlayer = input.next();
            }
            System.out.println("Create team Heat: ");
            NBATeam heat = new NBATeam("Heat");//create team Heat
            System.out.print("Add player to Heats? (yes / no): ");//adds people to the team
            ifAddPlayer = input.next();
            while (ifAddPlayer.equalsIgnoreCase("yes")) {
                System.out.print("What is the name: ");//gets the name of the player
                playerName = input.next();
                heat.addAPlayer(playerName);//adds the player to the team
                System.out.print("Add another player to heats? (yes / no) : ");//asks if the user wants another player
                ifAddPlayer = input.next();
            }
            System.out.println("The game is starting: ");//starts the game
            for (int i = 0; i < 7; i++) {//random number generator
                double j = Math.random();
                if (j > 0.5) {
                    heat.win();
                    Spurs.lose();//if greater then 0.5 then heat wins
                } else {
                    heat.lose();//if lower then 0.5 then spur wins
                    Spurs.win();
                }
            }
            if (heat.winNumber() > Spurs.winNumber() || Spurs.winNumber() > heat.winNumber()) {
                if (heat.winNumber() > Spurs.winNumber()) {//wins between the 2 teams
                    System.out.println(heat.Name() + "wins");
                } else {
                    System.out.println(Spurs.Name() + "wins");
                }
            }
            System.out.println(heat);
            System.out.println(Spurs);
        }
    }
    class NBATeam {//class to create the NBATeam
        private final String Name;
        private int Win;
        private int Loss;
        private int count = 0;//declaring the variables
        private String [] playerArray = new String[1];
        private String [] temp = new String[1];
        public NBATeam(String name) {
            Name = name;
        }
        public String Name(){
            return Name;
        }
        public void addAPlayer(String playerName){
            count++;
            if(count == 1) {
                playerArray [count-1] = playerName;//adds the player name to a array to use
            } else {
                playerArray = new String[count];
                System.arraycopy(temp, 0, playerArray, 0, temp.length);
                playerArray[count-1] = playerName;
                temp = new String[count];
            }
            System.arraycopy(playerArray, 0, temp, 0, playerArray.length);
        }
        public void win(){
            Win++;//winning scenario
        }
        public int winNumber() {
            return Win;//total number of wins
        }
        public void lose(){
            Loss++;//losing scenario
        }
        public String toString() {
            return Name +" "+ Arrays.toString(temp) + " win : " + Win +
                    " Lose : " + Loss;//final amount
        }
    }
