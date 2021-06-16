//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri June 15
//Homework 1 part 1
public class Homework1part1 {
    public static final int Line1 = 4;//how many lines of stars for top
    public static final int Line2 = 5;//how many lines or stars for middle
    public static final int Line3 = 5;//how many lines of stars for bottom
    public static final int x = 1;//how many stars it starts with
    public static final int y = 2;//how many stars it starts with
    public static final int z = 3;//how many stars it starts with
    //the declaration of variables
    public static void main(String[] args) {
        Main();
        treebase();
        //main part that runs the methods
    }
    public static void Main(){
        bottom(Line1, x);
        bottom2(Line2, y);//this method simplifies the main class
        bottom3(Line3, z);
    }
    public static void treebase(){
        System.out.println("***********");
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
        //this is the base of the tree
    }
    public static void bottom(int Line1, int x) {
        for (int a = x; a <= Line1; a++) {
            for (int c = 1; c <= (-1 * a + Line1); c++)//this is how many stars it starts with
                System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            for (int d = 3; d <= (2 * a + 1); d++)
                System.out.print("*");
            System.out.println("");
            //the first triangle
        }
    }
    public static void bottom2(int Line2, int y) {
        for (int a = y; a <= Line2; a++) {
            for (int c = 1; c <= (-1 * a + Line2); c++)//this is the same code as above for all the triangles but with different parameters
                System.out.print(" ");
            System.out.print(" ");
            for (int d = 3; d <= (2 * a + 1); d++)
                System.out.print("*");
            System.out.println("");
            //the middle triangle
        }
    }
    public static void bottom3(int Line3, int z) {
        for (int a = z; a <= Line3; a++) {
            for (int c = 1; c <= (-1 * a + Line3); c++)//same as above this line controls how many stars it starts with
                System.out.print(" ");
            System.out.print(" ");
            for (int d = 3; d <= (2 * a + 1); d++)
                System.out.print("*");
            System.out.println("");
            //the bottom triangle
        }
    }
}
