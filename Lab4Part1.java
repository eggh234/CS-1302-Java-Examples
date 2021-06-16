//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Lab 4 part 1
import java.util.*;
public class Lab4Part1 {
    public static int User = 0;//User inputted value
    public static int Count = 1;//Counter for how many digits
    public static int number = 0;//originally inputted number
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        User = input.nextInt();//grabs user input
        number = User;//gets the final value before it changes
        Counter();
    }
    public static void Counter(){
        while ((User / 10) !=0){//while the number divided by 10 is not 0, keep dividing
            User = User / 10;//the reason is because the computer rounds down so it takes off a digit everytime
            Count++;//adds one to the counter everytime the loop implements
        }
        System.out.println("The amount of digits in " + number + " is " + Count);
    }
}
