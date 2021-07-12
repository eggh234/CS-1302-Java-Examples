//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue July 13th
//Homework 5 part 2 main
import java.awt.Graphics;
public class DanielLineTest{
    public static void main(String[] args) {
        DrawingPanel background = new DrawingPanel(300,300);//creates the panel and calls the function
        DanielLine Line1 = new DanielLine(new Dot(5,4), new Dot(8,7));//creates the line object with 2 parameters
        Graphics g = background.getGraphics();
        Line1.draw(g);
    }
}
