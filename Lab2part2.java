//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 11
//Lab 2 part 2
import java.util.*;
public class Lab2part2 {
    public static double Weight = 0;
    public static double Height = 0;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int retry = 1;
        boolean value = false;//checks for fail condition
        do {
            try {
                System.out.println("Daniel Huang | 002545487");
                System.out.println("Please input weight");//asks for user values to be used later in the code
                Weight = Double.parseDouble(input.next());
                System.out.println("Please input height");
                Height = Double.parseDouble(input.next());
                value = true;//sets fail condition
                if ((Weight < 0 || Height < 0) && retry == 1) {//checks fail condition
                    value = false;
                    System.out.println("Please enter valid input. You only get one more chance.");
                    retry--;//if retry falls below 0, it fails the check
                }
            }catch(NumberFormatException e){
                    if (retry == 1) {//catches the error and triggers following events
                        System.out.println("Please try again.");
                    } else {
                        System.out.println();
                    }
                    retry--;
                }
            } while((!value && retry>=0));
                Double bmi = Weight / (Height * Height) * 703;
                if (bmi < 18.5) {//calculates BMI
                    System.out.println("Underweight");
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    System.out.println("Normal");
                } else if (bmi >= 25.0 && bmi <= 29.9) {
                    System.out.println("Overweight");
                } else if (bmi >= 30.0){
                    System.out.println("Obese");
                }
                else {
                    System.out.println("You Failed");//this is where the fail goes if the user fails twice
                }
            input.close();
        }
    }
