//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue July 13th
//Homework 5 part 1
import java.util.*;
class Bank {
    public static void main(String[] args) {//main class
        int AccNum;//stores the number of accounts
        Random RandomNumber = new Random();//generates the random number
        double Balance;//creates the balance value
        Scanner scan = new Scanner(System.in);//scanner for user input
        System.out.print("Enter the number of accounts to generate:");//gets the number of accounts
        AccNum= scan.nextInt();
        if (AccNum > 1000) {//checks for maximum amount of accounts
            System.out.println("Maximum number of accounts is 1000");
        }
        PaypalAccount[] AccObj = new PaypalAccount[AccNum];//creates array based on number of accounts
        for (int abc = 0; abc < AccNum; abc++) {//generates the random balance
           Balance= RandomNumber.nextDouble() * (1000.0 - 0.0) + 0.0;
            AccObj[abc] = new PaypalAccount(abc, Balance);
        }
        String PID = "002-54-5487";//my GSU campus ID
        System.out.print("\nMy Panther ID is " + PID);//prints my PID
        System.out.println("\n");//prints new line
        int MyAccount = Integer.parseInt(PID.substring(0, 3));//gets the first 3values of my PID
        double BalanceTotal = 0;//Balance total
        double Largest = AccObj[0].Balance;//value at position 0
        double Lowest = AccObj[0].Balance;
        int Low = 0;
        int High = 0;
        boolean Account = false;
        int abc;
        for (abc = 0; abc < AccNum; abc++) {//does the array for account
            if (AccObj[abc].AccountID == MyAccount) {//checks if the account is real
                Account = true;
                abc = AccNum + 1;
                System.out.print("my bank account ID is " + MyAccount);
                System.out.print(" and the balance is: $");
                System.out.printf("%.1f", AccObj[AccNum - 1].Balance);
                System.out.println("\n");
            }
        }
        if (!Account) {//checks if account is real
            AccObj[AccNum - 1].AccountID = MyAccount;
            AccObj[AccNum - 1].Balance = Double.parseDouble(PID.substring(4, 6) + PID.substring(8)) / 100.00;
            System.out.print("my bank account ID is " + MyAccount);
            System.out.print(" and the balance is: $");
            System.out.printf("%.1f", AccObj[AccNum - 1].Balance);
            System.out.println("\n");
        }
        for (abc = 0; abc < AccNum; abc++) {//finds the highest and lowest amounts
            if (AccObj[abc].Balance < Lowest) {//lowest amount
                Lowest = AccObj[abc].Balance;
                Low = abc;
            }
            if (AccObj[abc].Balance > Largest) {//highest amount
                Largest = AccObj[abc].Balance;
                High = abc;
            }
            BalanceTotal += AccObj[abc].Balance;
        }
        System.out.print("The average balance is: $");//prints the results
        double avg=(BalanceTotal / AccNum);
        System.out.printf("%.1f", avg);
        System.out.println("\n");
        System.out.print("The account with the largest balance is: AccountID = "
                + AccObj[High].AccountID);
        System.out.printf(" ,balance =%.1f",AccObj[High].Balance);
        System.out.println("\n");
        System.out.print("The account with the lowest balance is: AccountID = "
                + AccObj[Low].AccountID);
        System.out.printf(" ,balance =%.1f",AccObj[Low].Balance);
    }
}
public class PaypalAccount {
    double Balance;//creating the variable balance
    int AccountID ;//make the AccountID variable
    public PaypalAccount(int inAccID, double inBal) {//parameter
        super();
        this.AccountID = inAccID;//sets the value for AccountID
        this.Balance = inBal;//sets the value for balance
    }
}