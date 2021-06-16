//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 18
//Homework 4 part 2
import java.util.*;
public class Homework2part1 {
    public static int min = 1;//min for random number
    public static int max = 15;//max for random number
    public static int Random = (int) (Math.random() * (max - min + 1) + min);//generates a random number
    public static Scanner input = new Scanner(System.in);//initializes scanner
    public static Double[] Number = new Double[Random];//generates an array based on the random number

    public static void main(String[] args) {
        System.out.println(Random + " values have been generated.");//tells the user how many values have been generated
        Salary((Random));//puts the random value into Salary as a parameter
        Tax();//calculates tax
    }
    public static void Salary(double Random) {
        double User;//this method creates a array based on user input
        for (int a = 0; a < Random; a++) {//creates a for loop to fill up the entire array until its full
            System.out.println("Input a Salary: ");//loops upward until it reaches the end of the array
            User = input.nextDouble();//gets a user input to put into the array
            Number[a] = User;//puts the user value into the array
        }
    }
    public static void Tax(){//calculates taxes based on the criteria
        double temp = 0;
        double temp2 = 0;
        for (int i = 0; i < Random; i++) {
            if(Number[i] <= 750) {
                System.out.printf("Your tax is %.2f\n", (Number[i]*.01));//gets the value from the array
            } else if (Number[i] >= 750 || Number[i]<= 2500){
                System.out.printf("Your tax is %.2f\n", (7.5 + (Number[i] - 750) * 0.02));//calculates the taxes
                temp2 = (7.5 + (Number[i] - 750) * 0.02);//sets the value to temp2
            } else if (Number[i] >= 2500 || Number[i]<= 5000){
                System.out.printf("Your tax is %.2f\n", (82.5 + (Number[i] - 2500) * 0.04));
                temp2 = (82.5 + (Number[i] - 2500) * 0.04);
            } else if (Number[i] >= 5000 || Number[i]<= 8000){
                System.out.printf("Your tax is %.2f\n", (142.5 + (Number[i] - 5000) * 0.05));
                temp2 = (142.5 + (Number[i] - 5000) * 0.05);
            } else if (Number[i] >= 8000){
                System.out.printf("Your tax is %.2f\n", (230.0 + (Number[i] - 8000) * 0.06));
                temp2 = (230.0 + (Number[i] - 8000) * 0.06);
            }
            if (temp <= temp2) {
                temp = temp2;//does comparing for largest value
            }
        }
        System.out.println("The biggest tax value is " + temp);//prints out the largest value
    }
}
