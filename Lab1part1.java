//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 11
//Lab 1 part 1
public class Lab1part1 {
    public static int a = 87;//declaring last 2 digits of the PIN
    public static int m = 2 * (a + 5);//declaring m

    public static void main(String[] args) {
        sequence();//main part that runs methods
    }
    public static void sequence() {
        int sum = 0;
        for (int a = m; a <= 60 + m; a += 2) {
            sum = sum + a;//the loop that adds
        }
        System.out.println(sum);
    }
}