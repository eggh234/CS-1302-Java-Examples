//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Lab 4 part 2
import java.util.*;
public class Lab4Part2 {
    public static String User;//the user inputted value
    public static Scanner input = new Scanner(System.in);//initializes scanner
    public static void main(String[] args) {
        System.out.println("Input a word to count: ");
        String User = input.next();
        if ( Character.isDigit(User.charAt(0)) )//checks if the first value is a number
        {
            System.out.println("String begins with a digit");
        } else {
            int length = User.length();//gets the length of the line of text
            System.out.println("The length of '" + User + "' is: " + length);//prints it out
        }
    }
}

