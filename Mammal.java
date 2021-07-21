//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Wed July 21
//Lab 13
class Lab13 {
    public static void main(String[] args) {
        Student alex = new Student(54, 3.4, "CS", 18, 150, 170);
        Doctor jack = new Doctor(4, "Dermatology", 40, 179, 173);
        System.out.println("\nJACK DETAILS");//creating the Student Class
        System.out.println("Speciality: " + jack.getSpeciality());//his specialty
        System.out.println("Height: " + jack.getHeight());//his height
        System.out.println("Weight: " + jack.getWeight());//his weight
        System.out.println("Salary: " + jack.getSalary());// his salary
        System.out.println("ALEX DETAILS");//alex
        System.out.println("Major: " + alex.getMajor());//his major
        System.out.println("GPA: " + alex.getGpa());//his gpa
        System.out.println("Year: " + alex.getYear());//his year
        System.out.println("Age: " + alex.getAge());//his age
    }
}
class Human {
    int age;//age variable
    double weight, height;// double weight and height
    Human(int a, double w, double h) {//the constructor
        age = a;
        weight = w;//initializing variables
        height = h;
    }
    int getAge()
    {
        return age;
    }//gets the age
    double getWeight()
    {
        return weight;
    }//gets the weight
    double getHeight()
    {
        return height;
    }//gets the height
}
class Student extends Human {
    int creditHours;//the data
    double gpa;//the gpa
    String major;//the major of the person
    Student(int C, double G, String M, int a, double w, double h) {//the constructor
        super(a, w, h);
        creditHours = C;
        gpa = G;//setting variable values
        major = M;
    }
    String getMajor()
    {
        return major;
    }
    double getGpa()
    {
        return gpa;
    }
    String getYear() {//deciding if he is a freshman, sophomore, or a junior/senior
        if(creditHours < 32)
            return "Freshman";
        if(creditHours < 64)
            return "Sophomore";
        if(creditHours < 96)
            return "Junior";
        return "Senior";
    }
}
class Doctor extends Human {
    int years;//initializing years variable
    String speciality;
    Doctor(int y, String s, int a, double w, double h) {
        super(a, w, h);//setting the values for year and specialty variable
        years = y;
        speciality = s;
    }
    String getSpeciality() {
        return speciality;
    }//returns specialty
    int getSalary() {
        return 40000 + (years - 1) * 5000;
    }//returns the salary based on year and specialty
}