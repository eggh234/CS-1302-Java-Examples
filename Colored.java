//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Tue July 20
//Homework 6 Part 2
public interface Colored{
    public String getColor();
}
 class Pointer {//pointer class
    private int a;//declaring the a variable
    private int b;//declaring the b variable
    public Pointer() {
        this(0, 0);
    }
    public Pointer(int a, int b) {
        setLocation(a, b);
    }
    public boolean equals(Object o) {//checking object o
        if (o instanceof Pointer) {
            Pointer other = (Pointer) o;
            return a == other.a && b == other.b;//checks if its equal or not
        } else {
            return false;
        }
    }
    public void setLocation(int a, int b) {//sets the location
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return "(" + a + ", " + b + ")";
    }//prints the string
}

