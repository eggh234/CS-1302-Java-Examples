//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Lab 3 part 2
import java.util.*;
public class Lab3Part2 {
    public static double User = 0.0;
    public static double Total = 0.0;
    public static double number = 0.0;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a number to average or a negative one to stop: ");
        User = Double.parseDouble(input.next());//this method asks the user for a user input
        Check();
    }
    public static void Check(){
        if (User < 0){//check if user input is less then 0
            Average();//if the user input is less then 0 it ends and runs average
        } else {
            Total = Total + User;//adds to total sum
            number++;//divide by number goes up by one
            ask();//asks for more numbers
        }
    }
    public static void Average(){
        if (number == 0){//if the first number is negative, print 0.0 as average
            System.out.println("Your average is: " + number);
        } else{//otherwise do the average as normal
            System.out.println("Your average is: " + (Total/number));
        }
    }
    public static void ask(){
        System.out.println("Input a number to average or a negative one to stop: ");
        User = Double.parseDouble(input.next());//this method asks the user for a user input
        Check();//runs the check
    }
}
