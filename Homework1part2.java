//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 15
//Homework 1 part 2
public class Homework1part2 {
    public static final int Line1 = 4;//how many lines of stars for top
    public static final int Line2 = 5;//how many lines or stars for middle
    public static final int x = 1;//how many stars it starts with
    public static final int y = 2;//how many stars it starts with
    public static void main(String[] args) {
        Main();
        treebase();
        //main part that runs the methods
    }
    public static void Main(){
        bottom(Line1, x);
        bottom2(Line2, y);//simplifies the main class
    }
    public static void bottom(int Line1, int x) {
        for (int a = 1; a <= Line1; a++)/*what number of stars the first line starts with
            */ {
            for (int c = 1; c <= (-1 * a + Line1); c++)
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");//allignment
            for (int d = 3; d <= (2 * a + 1); d++)
                System.out.print("*");
            System.out.println("");
            //top segment
        }
    }

    public static void bottom2(int Line2, int y) {
        for (int a = 2; a <= Line2; a++) {
            for (int c = 1; c <= (-1 * a + Line2); c++)//same methods as above
                System.out.print(" ");
                System.out.print(" ");//allignment
            for (int d = 3; d <= (2 * a + 1); d++)
                System.out.print("*");
            System.out.println("");
            //bottom segment
        }
    }

    public static void treebase() {//tree base
        System.out.println("***********");
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
    }

}
