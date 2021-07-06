//Name: Yen-Ju Huang
//PIN:002545487
//Due date: Fri July 2
//Lab 8
    public class Lab8 {
    static class Circle {//the Circle class
        public static void main(String[] args) {
            Point p1 = new Point(10,5);//creates object p1
            Lab8 c1 = new Lab8(p1,7);//creates object c1
            System.out.println(c1);//prints it out
            System.out.println("Area: " + c1.Area());//prints area
            System.out.println("Circumference: " + c1.Circumference());//prints circumference
            Point p2 = new Point(5,7);//check if point lies in circle
            if(c1.contains(p2 )) {
                System.out.println("(" + p2 + ") is within the circle");//prints it lies in circle
            }
            else {
                System.out.println("(" + p2 + ") is not within the circle");//else it prints it doesn't lie in circle
            }
        }
    }
        private final int radius;//radius variable
        public Point center;//creating the object
        public Lab8(Point center, int radius) {
            this.radius = radius;//the radius
            this.center = center;//the center
        }
        public double Circumference() {//how to get circumference
            return (2 * Math.PI * radius);//computes circumference
        }
        public double Area() {//How to get area
            return (Math.PI * radius * radius);//computes the area
        }
        public String toString() {//how to get to string
            return "Circle[center=(" + center + "), radius=" + radius + "]";//gets the string value
        }
        public boolean contains(Point p) {//checks if point P lies in the circle
            return Point.Distance(center, p) <= radius;//if center less then radius return true else return false
        }
    }
    class Point {
        private final int xp;
        private final int yp;//private instances declared
        public Point(int xp, int yp) {//constructor
            this.xp = xp;// refer current class instance variable using this.xp
            this.yp = yp;//refer current class instance variable using this.yp
        }
        public String toString() { //this returns a String object representing the value of this Integer
            return xp + "," + yp;
        }
        public static double Distance(Point a, Point b) {//Method for calculate distance between two points
            return Math.sqrt((a.xp - b.xp)*(a.xp - b.xp) + (a.yp - b.yp)*(a.yp - b.yp));
            // computes the distance between points
        }
    }
