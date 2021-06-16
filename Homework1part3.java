//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 15
//Homework 1 part 3
import java.lang.reflect.Array;
import java.util.*;
public class Homework1part3 {
  public static Scanner input = new Scanner(System.in);

  //public static
  public static void main(String[] args) {
    System.out.println("How many digits would you like to swap? ");
    int length = input.nextInt();//this method asks the user for a user input
    swapDigitPairs(length);
    System.out.println(" ");
    System.out.println("How many letters would you like to swap ? ");
    int lengthLetters = input.nextInt();
    lengthLetters += 1;
    swapLetterPairs(lengthLetters);
  }
  public static void swapDigitPairs(int length) {
    Integer[] Number = new Integer[length];
    int one = 0;//this method creates a array based on user input
    for (int a = 0; a < length; a++) {
      one = 0;
      System.out.println("Input a digit of your PID: ");
      one = input.nextInt();
      Number[a] = one;//this method also fills up the array from user inputs of their PID
    }
    if (Number.length % 2 == 1) {//checks to see if the array has an odd amount or even amount
      System.out.print(Number[0]);//prints the first number before continuing
      for (int z = 1; z < Number.length; z += 2){
        int placeholder = Number[z];//this is the part that swaps the numbers around using a third placeholder variable
        Number[z] = Number[z + 1];
        Number[z + 1] = placeholder;
        System.out.print(Number[z] + "" + Number[placeholder]);
      }
    } else {
      for (int i = 0; i < Number.length; i += 2) {
        int placeholder = Number[i];
        Number[i] = Number[i + 1];
        Number[i + 1] = placeholder;//this one works by going up in increments of 2 to access the number after
        System.out.print(Number[i] + "" + Number[placeholder]); //then it uses a placeholder value to swap values before printing
      }
    }
  }
  public static void swapLetterPairs(int length) {
    String[] Number = new String[length];   //this method works the same as above but with letters instead
    String one = "";
    for (int a = 0; a < length; a++) {
      one = "";
      System.out.println("Input letters: ");
      one = input.nextLine();
      Number[a] = one;
    }
    if (Number.length % 2 == 1) {//checks to see if the array has an odd amount or even amount
      System.out.print(Number[0]);//prints the first number before continuing
      for (int z = 1; z < Number.length; z += 2){
        String placeholder = Number[z];
        Number[z] = Number[z + 1];//adds a third placeholder value that allows you to swap values
        Number[z + 1] = placeholder;
        System.out.print(Number[z] + "" + Number[z + 1]);
      }
    } else {
      for (int i = 0; i < Number.length; i += 2) {//this one works by going up in increments of 2 to access the letter after
        String placeholder = Number[i];
        Number[i] = Number[i + 1];
        Number[i + 1] = placeholder;
        System.out.print(Number[i] + "" + Number[i + 1]);
      }
    }
  }
}



