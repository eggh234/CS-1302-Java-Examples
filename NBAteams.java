//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 23
//Lab 5 part 1
public class NBAteams {
    String teamName;
    int Numberofwin;
    int Numberofloss;
    public NBAteams(String s, int w, int l){
        teamName = s;
        Numberofwin = w;
        Numberofloss = l;
    }//records the number of wins and losses
    public void winaGame(){

        Numberofwin++;
    }
    public void loseaGame(){

        Numberofloss++;
    }
    public String toString(){
        return (teamName+ ": The number of wins is " + Numberofwin + " and the number of losses is " + Numberofloss);
    }
}