//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Homework 4 part 2
import java.util.*;
public class Homework2Part2 {
    public static int User = 0;
    public static int User2 = 0;
    public static int zero = 0;
    public static int one = 1;
    public static int two = 2;
    public static int three = 3;
    public static int four = 4;
    public static int five = 5;
    public static int six = 6;
    public static int seven = 7;
    public static int eight = 8;
    public static int nine = 9;
    public static int Zero = 0;
    public static int One = 0;
    public static int Two = 0;
    public static int Three = 0;
    public static int Four = 0;
    public static int Five = 0;
    public static int Six = 0;
    public static int Seven = 0;
    public static int Eight = 0;
    public static int Nine = 0;

    public static Scanner input = new Scanner(System.in);//initializes scanner

    public static void main(String[] args) {
        System.out.println("How man digits do you want to test? ");
        User = input.nextInt();//gets a user input to put into the array
        if (User == 0){
            System.out.print("");
        } else {
            Integer[] Number = new Integer[User];//generates an array based on the random number
            for (int a = 0; a < User; a++) {//creates a for loop to fill up the entire array until its full
                System.out.println("Input a Digit: ");//loops upward until it reaches the end of the array
                User2 = input.nextInt();//gets a user input to put into the array
                Number[a] = User2;//puts the user value into the array
            }
            for (int a = 0; a < User; a++) {
                if (Number[a] == one) {
                    One++;
                } else if (Number[a] == two) {
                    Two++;
                } else if (Number[a] == three) {
                    Three++;
                } else if (Number[a] == four) {
                    Four++;
                } else if (Number[a] == five) {
                    Five++;
                } else if (Number[a] == six) {
                    Six++;
                } else if (Number[a] == seven) {
                    Seven++;
                } else if (Number[a] == eight) {
                    Eight++;
                } else if (Number[a] == nine) {
                    Nine++;
                } else if (Number[a] == zero) {
                    Zero++;
                }
            }
            System.out.println("Digit:       0 1 2 3 4 5 6 7 8 9");
            System.out.println("Occurrences: " + Zero  + " " + One + " " + Two + " " + Three + " " + Four + " " + Five + " " + Six + " " + Seven + " " + Eight + " " + Nine);
        }
    }
}
