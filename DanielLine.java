//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue July 13th
//Homework 5 part 2 constructor
import java.awt.*;
class Dot {
    private final int PointX;//private data to store value of X
    private final int PointY;//private data to store value of Y
    public Dot(int PointX, int PointY) {//constructor to initialize values
        this.PointX = PointX;//point x
        this.PointY = PointY;//point y
    }
    public int Y() {//gets value y
        return PointY;
    }
    public int X() {//gets value x
        return PointX;
    }
    public String toString() {//returns x and y value
        return PointX+","+PointY;//x,y value
    }
}
public class DanielLine{
    private final Dot p2;//private value of point2
    private final Dot p1;//private value of point1
    public DanielLine(Dot p1, Dot p2) {//initializes the data values
        this.p2 = p2;//gets p2
        this.p1 = p1;//gets p1
    }
    public String toString() {
        return "["+p1+", "+p2+")]";
    }//string representation of the line
    public void draw(Graphics g) {
        g.drawLine(p1.X(), p1.Y(), p2.X(), p2.Y());//draws the line
    }
}