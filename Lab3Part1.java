//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Lab 3 part 1
import java.util.*;
public class Lab3Part1 {
    public static void main(String[] args) {
        int a;//for the first number
        int b;//for the second number
        for (a = 5; a >= 1; a--){//counts down from top to bottom
            for (b = a; b <= 5; b++){//counts up from the bottom to top
                System.out.print(b);//prints out the values
            }
            if(a == 2)
                System.out.print("\n");//creates a new line for the next numbers
            else
                System.out.print("\n\n");//creates the spaces between the lines
        }
    }
}
