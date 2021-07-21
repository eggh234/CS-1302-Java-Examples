//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Friday July 16
//Lab 12
class Lab12 {
    public static void main(String[] args) {//creates the Cat object
        Cat cat = new Cat(false,"meat",4,"white");//prints the attributes
        System.out.println("Is the cat vegetarian? "+cat.isVegetarian());//eats meat
        System.out.println("What the cat eats: "+cat.getEats());//prints what it eats
        System.out.println("The cat has "+cat.getNumLegs()+" legs.");//prints out the 4 legs
        System.out.println("The cats color is "+cat.getColor());//prints the white color
    }
}
class Cat extends Animal{
    private String color;
    public Cat(boolean vegetarian, String eats, int numLegs, String color) {//constructs Cat
        super(vegetarian, eats, numLegs);
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;//gets color
    }
    public String getColor() {//gets and sets values
        return color;
    }
}
class Animal{
    private int numLegs;
    private String eats;
    private boolean vegetarian;
    public Animal(boolean vegetarian, String eats, int numLegs) {//constructs the Animal
        this.vegetarian = vegetarian;
        this.numLegs = numLegs;
        this.eats = eats;
    }//gets and sets values
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;//is vegetarian
    }
    public int getNumLegs() {
        return numLegs;//number of legs
    }
    public String getEats() {
        return eats;//eats
    }
    public void setEats(String eats) {
        this.eats = eats;//what it eats
    }
    public boolean isVegetarian() {
        return vegetarian;//is vegetarian
    }
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;//number of legs
    }
}
