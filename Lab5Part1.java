//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 23
//Lab 5 part 1
import java.util.*;
public class Lab5Part1 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int User = 0;
        System.out.println("How many digits would you like to enter? ");
        int length = input.nextInt();//this method asks the user for a user input
        Integer[] Number = new Integer[length];
        if (Number.length  < 2){//checks if the array length is less then 2
            System.out.println("The smallest difference is 0");
        } else {
            for (int a = 0; a < length; a++) {
                System.out.println("Input a digit: ");
                User = input.nextInt();
                Number[a] = User;//this method also fills up the array from user inputs
            }
            MinGap(Number);
            System.out.println("The smallest difference is: " + MinGap(Number));
        }
    }

    public static Integer MinGap(Integer[] Number) {
        int w = 0;
        Integer[] Number2 = new Integer[Number.length-1];
        for (int i = 0; i < Number.length - 1; i++) {//computes the difference between the value before it and itself
            w = (Number[i + 1] - Number[i]);
            Number2[i] = w;//adds that value to a different array for comparison
        }
        for (int i = 0; i < Number2.length - 1; i++) {
            int y = 0;
            if (Number2[i+1] < Number2[i]){//compares for the smallest value
                y = Number2[i+1];
            }
        }
        return Number2[0];
    }
}
