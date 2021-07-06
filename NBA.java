//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 23
//Lab 5 part 1
import java.util.*;
public class NBA {
    public static void main(String[] args) {
        NBAteams Heat = new NBAteams("Heat", 0, 0);
        NBAteams Laker = new NBAteams( "Laker", 0, 0);
        Random Basket = new Random();
        for(int i = 0; i<3; i++){
            double s = Basket.nextDouble();
            if (s > 0.5){
                Heat.winaGame();
                Laker.loseaGame();
            } else {
                Laker.winaGame();
                Heat.loseaGame();
            }
        }
        System.out.println(Heat);
        System.out.println(Laker);
    }
}
