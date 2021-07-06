//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Tue June 29
//Homework 3 part 2
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Homework3Part2{
    public static void main(String[] args) {
        DrawMateDesign app = new DrawMateDesign();
        app.setSize(400, 400);//window properties
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes when you press x
    }
    public static class DrawMateDesign extends JFrame {
        private static final long serialVersionUID = 1L;
        public void paint(Graphics a) {
            int Circle;
            int size = 40;
            a.setColor(Color.cyan);//background color
            a.fillRect(0, 0, 400, 400);
            Circle = 5;//draws the circle pattern with paramters
            draw(0, 0, 100, Circle, a);//draws the right side square on top
            Circle = 5;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    draw(135 + i * size, j * size, size, Circle, a);
                }
            }
            size = 24;
            Circle = 5;//parameter for the bottom left square
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    draw(5 + i * size, 120 + j * size, size, Circle, a);
                }
            }
            size = 36;
            Circle = 3;//parameter for the bottom right square
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    draw(135 + i * size, 243 + j * size, size, Circle, a);
                }
            }
        }
        public void draw(int x, int y, int size, int noOfCircle, Graphics a) {
            y += 40;
            x += 10;
            a.setColor(Color.green);//sets the green squares
            a.fillRect(x, y, size, size);//draws the square
            a.setColor(Color.yellow);//sets the color
            a.fillOval(x, y, size, size);//draws the smaller circle loops
            a.setColor(Color.black);//sets black line color
            a.drawRect(x, y, size, size);//draws the rectangle
            a.drawLine(x, y, x + size, y + size);//draws the x
            a.drawLine(x, y + size, x + size, y);//draws the plus signs
            a.drawLine(x, y + size / 2, x + size, y + size / 2);
            int equalSize = size / noOfCircle;
            for (int i = 0; i < noOfCircle; i++) {
                a.drawOval(x + equalSize * i / 2, y + equalSize * i / 2, size - equalSize * i, size - equalSize * i);
            }
        }
    }
}