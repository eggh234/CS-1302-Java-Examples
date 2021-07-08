//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue June 29
//Homework 3 part 2
import java.awt.*;
public class Homework3Part4{
    public static void main(String[] args) {
        DrawingPanel Panel = new DrawingPanel(400, 400);
        Graphics a = Panel.getGraphics();
        a.setColor(Color.cyan);
        a.fillRect(0,0,400,400);
        Square(a,0,0,100,100);
        Square(a,200,30,180,180);
        Square(a,200,240,120,120);
        Square(a,60,180,120,120);
        Oval(a,0,0,100,100);
        Circle(a,0,0,100,100);
        Line(a,0,50,100,50);
        Line(a,50,0,50,100);
    }
    public static void Square(Graphics a, int x, int y, int width, int height) {
        a.setColor(Color.green);
        a.fillRect(x,y,width,height);
        a.setColor(Color.black);
        a.drawRect(x,y,width,height);
    }
    public static void Oval(Graphics a, int x, int y, int width, int height) {
        a.setColor(Color.yellow);
        a.fillOval(x,y,width,height);
        a.setColor(Color.black);
        a.drawOval(x,y,width,height);
    }
    public static void Circle(Graphics a, int x, int y, int width, int height){
        for (int b = 10; b < 60; b=b+10) {
            a.setColor(Color.black);
            a.drawOval(0+b,0,width-b,height-b);
        }
    }
    public static void Line(Graphics a, int x, int y, int width, int height){
            a.setColor(Color.black);
            a.drawLine(x,y,width,height);
    }
}
