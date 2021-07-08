//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri July 6th
//Homework 4 part 1
import java.util.*;
public class Homework4Part1 {
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("what is the numerator?");
        a = input.nextInt();
        System.out.println("what is the denominator");
        b = input.nextInt();
        System.out.println("scale up or down?(1 or 0)");
        c = input.nextInt();
        if (c == 1) {
            System.out.println("enter scale factor");
            d = input.nextInt();
            Count(a, b, d);
        } else if (c == 0) {
            System.out.println("enter scale factor");
            d = input.nextInt();
            Count2(a, b, d);
        }
    }

    public static void Count(int a, int b, int d) {
        e = (a * d);
        System.out.println(e + "/" + b);
    }

    public static void Count2(int a, int b, int d) {
        e = (b * d);
        System.out.println(a + "/" + e);
    }
}
