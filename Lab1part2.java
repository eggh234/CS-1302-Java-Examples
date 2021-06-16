//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 11
//Lab 1 part 2
public class Lab1part2 {
    public static int a = 87;//declaring last 2 digits of the PIN
    public static int m = 2 * (a + 5);//declaring m
    public static int A = 0;//declaring area variable
    public static void main(String[] args){
        square();
        System.out.println();
        middleloop();//main function part that calls other methods
        square();
        System.out.println();
        area();
    }
    public static void square(){
        for (int a = 0; a < m; a++) {
            System.out.print("x");//prints out the xx at the very end
        }
    }
    public static void middle(){
        System.out.print("x");
        for (int i = 0; i <= m-3; i++) {
            System.out.print("a");
        }//logic that determines how many xax
        System.out.print("x");
        System.out.println();
    }
    public static void area(){
        A = m*m;
        System.out.println("The area of the square is: " + A);
    }
    public static void middleloop(){
        for (int i = 0; i <= m-3; i++) {
            middle();//loops the middle part to print xax certain amount of times
        }
    }
}
