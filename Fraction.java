//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Wed July 14
//Lab 11 Part 1
import java.util.*;
class MultiplyClient {
    public static Fraction Multiply(Fraction A1, Fraction f2) {//returns the value of the fraction
        return new Fraction(A1.Numerator()*f2.Numerator(), A1.Denominator()*f2.Denominator());
    }
    public static void main(String[] args) {
        Random RandomNumber = new Random();//random number
        Fraction[] fractionArray = new Fraction[10];//the array
        for(int i = 0; i < 10; i++) {//creates the array and puts values
            fractionArray[i] = new Fraction(1+RandomNumber.nextInt(10), 1+RandomNumber.nextInt(10));
        }
        for(int i = 1; i < 10; i++) {//uses the multiply function
            Fraction result=Multiply(fractionArray[i-1], fractionArray[i]);
            System.out.println(result);
        }
    }
}
public class Fraction {
    private final int numerator;//variable numerator
    private final int denominator;//variable denominator
    public Fraction(int numerator, int denominator) {//constructs the fraction
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int Numerator() {//sets the numerator
        return numerator;
    }
    public int Denominator() {
        return denominator;//sets the denominator
    }
    public String toString() {
        return  numerator +"/" + denominator;
    }
}