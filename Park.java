//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Fri July 9th
//Homework 4 part 2
class ParkClient{
    public static void main(String[] args){//creates the park object
        Park p1 = new Park("CSC1302",87,"Circle",5);//creates each of the parts
        Park p2 = new Park("CSC1302",90,"Square",6);
        Park p3 = new Park("CSC1303",54,"Circle",9);
        Park p4 = new Park("CSC1304",48,"Square",8);
        Park p5 = new Park("CSC1305",69,"Square",3);
        Park[] ParkArray = {p1,p2,p3,p4,p5};//puts the values into a park array
        int largestParkIndex = 0;//stores the largest park into the array
        for(int i = 0;i<ParkArray.length;++i){//finds the largest length
            if(ParkArray[i].LengthGetter()>ParkArray[largestParkIndex].LengthGetter()){
                largestParkIndex = i;
            }
        }
        Park largestPark = ParkArray[largestParkIndex];//prints out the information of the parks
        System.out.println("Park name : "+largestPark.NameGetter());
        System.out.println("Park id : "+ largestPark.IDGetter());
        System.out.println("Park shape : "+largestPark.Shape);
        System.out.println("Park Length : "+largestPark.LengthGetter());
    }
}
class Park{//creating the variable for the class
    public String Name;//value of Name
    public int ID;//value of ID
    public String Shape;//value of Shape
    private final double Length;//value of the length
    public Park(String Name,int ID,String Shape,double Length){
        this.Name = Name;//settings values for the park
        this.ID = ID;
        if(Shape.equals("Circle") || Shape.equals("Square"))//checks if it is a Circle or a Square
            this.Shape = Shape;
        else {
            System.out.println("Wrong park shape");
            System.exit(0);
        }
        this.Length = Length;//length of the park
    }
    String NameGetter(){//returns  the name of the park
        return this.Name;
    }//returns the values
    int IDGetter(){//returns  the id of the park
        return this.ID;
    }
    double LengthGetter(){//returns the length of the park
        return this.Length;
    }
}