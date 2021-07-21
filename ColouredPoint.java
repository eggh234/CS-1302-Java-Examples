//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Tue July 20
//Homework 6 Part 2
class ColoredPointTest {
    public static void main(String[] args) {
        ColoredPoint set1 = new ColoredPoint(30, 14, "blue");//creates the set 1 object
        ColoredPoint set2 = new ColoredPoint(63, 44, "purple");//creates the set 2 object
        System.out.println(set1);//prints out set 1
        System.out.println(set2);//prints out set 2
        System.out.println("does object 1 = object 2 ? "+ set1.equals(set2));//prints out the end result
    }
}
 class ColoredPoint extends Pointer implements Colored {//class colored paint
    private String color;//variable color
    public ColoredPoint(int x, int y, String color) {
        super(x, y);//the super class
        this.color = color;//sets the color
    }
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }//returns the color
    @Override//overrides
    public boolean equals(Object o) {
        ColoredPoint other = (ColoredPoint) o;
        return super.equals(o) && (other.getColor().equals(color));//checks if equal to the other color
    }
    @Override
    public String toString() {
        return super.toString() + ", Color : " + getColor();
    }
}



