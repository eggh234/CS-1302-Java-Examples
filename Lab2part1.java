//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 11
//Lab 2 part 1
import java.util.*;
public class Lab2part1 {
    public static int a = 87;//declaring last 2 digits of the PIN
    public static int m = (a + 5);//declaring m
    public static void main(String[] args) {
        Loop(m);
        System.out.println(Loop(m));
        Loop2(m);
        System.out.println(Loop2(m));
    }
    public static double Loop(double m){
        double sum = 0;
        for (double a = 2; a <= m; a+=2) {
            sum = sum + (1/a);//the loop that adds
        }
        return sum;
    }
    public static double Loop2(double m){
        double sum = 0;
        for (double a = 2; a <= 3*m-1; a+=2) {
            sum = sum + (1/a);//the loop that adds
        }
        return sum;
    }
}
