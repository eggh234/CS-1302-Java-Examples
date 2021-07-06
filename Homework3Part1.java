//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue June 29
//Homework 3 part 1
import java.util.*;
public class Homework3Part1 {
    public static int g;
    public static int h = 1;
    public static Scanner input = new Scanner(System.in);
    public static String[] Position = new String[10];
    public static int a = 0;

    public static void main(String[] args) {
        Arrays.fill(Position, "-");//prints the -
        System.out.println("We are going to play a game called Tic-Tac-Toe");
        play();
    }

    public static void play() {
        int c;
        int e;
        int f;//creates local variables
        g++;
        h++;
        System.out.println("What row?");
        e = input.nextInt();
        System.out.println("What column?");
        f = input.nextInt();//gets column and row values
        if (e > -1 || f > -1) {
            System.out.println("What position is it in? (1-9)");
            c = input.nextInt();//gets the position of the cross or the circle
            if ((h % 2) == 1) {
                Position[c] = "x";//puts x or o depending on the turn
            } else if ((h % 2) == 0) {
                Position[c] = "o";
            }
        } else if (e > -1 || f > -1) {
            System.out.println("Invalid number");//checks if the position is invalid
        }
        print();
    }

    public static void print() {
        int d;
        System.out.println("-------------------------");
        System.out.println("|   " + Position[1] + "   |   " + Position[2] + "   |   " + Position[3] + "   |   ");
        System.out.println("-------------------------");
        System.out.println("|   " + Position[4] + "   |   " + Position[5] + "   |   " + Position[6] + "   |   ");
        System.out.println("-------------------------");
        System.out.println("|   " + Position[7] + "   |   " + Position[8] + "   |   " + Position[9] + "   |   ");
        System.out.println("-------------------------");//prints the main array each time with updated values
        if (g >= 6) {
            System.out.println("Is there a winner?(1 for yes, 0 for no)");
            d = input.nextInt();//after turn 6 it will ask for a winner everytime
            if (d == 1) {
                System.out.println("We have a winner");
                System.out.print("");
            } else if (d == 0){
                play();//ends if there is a winner or it loops back
            }
        } else if (g < 6){
            play();//if less then 6 turns it loops back
        }
    }
}
