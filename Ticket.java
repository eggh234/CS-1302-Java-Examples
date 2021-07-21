//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Tue July 20
//Homework 6 Part 1
class TestTickets {
    public static void main(String[] args){//creating the tickets and advanced tickets
        AdvanceTicket demo1 = new AdvanceTicket(152, 21);
        System.out.println(demo1);
        SAdvanceTicket demo2 = new SAdvanceTicket(13, 52);
        System.out.println(demo2);
        SAdvanceTicket demo6 = new SAdvanceTicket(30, 15);
        System.out.println(demo6);
        Walkup demo7 = new Walkup(493);
        System.out.println(demo7);
        AdvanceTicket demo3 = new AdvanceTicket(159, 93);
        System.out.println(demo3);
        Walkup demo4 = new Walkup(56);
        System.out.println(demo4);
    }
}
public abstract class Ticket {
    private int ticketNum;
    public Ticket(int number){
        this.ticketNum = number;
    }//the subclass defines the price
    public abstract double getPrice();
    public String toString(){//returns the ticket name and price
        return "Ticket Number: " + this.ticketNum + "\n" + "Ticket Price: " + "$" + this.getPrice();
    }
}
class Walkup extends Ticket {//this type of ticket only has 1 price
    private final double walk = 50.00;
    public Walkup(int number){
        super(number);//calls the super and passes the ticket number
    }
    public double getPrice(){
        return walk;//returns the walkup ticket pricing
    }
    public String toString(){//prints the contents
        return super.toString() + "\n";
    }
}
 class AdvanceTicket extends Ticket {//creates pricing depending on how far away the event is
    int Days;//creating the Days int
    double Price;//creating the price double
    public AdvanceTicket(int num, int days){
        super(num);
        this.Days = days;
    }
    public double getPrice(){//sets the price depending on how far away the event is
        if(this.Days>=10){
            this.Price = 30.00;
        }else if(this.Days<10){
            this.Price = 40.00;
        }
        return this.Price;
    }
    public String toString(){//calls the super class to print the ticket values
        return super.toString() + "\n";
    }
}
class SAdvanceTicket extends AdvanceTicket {//the advanced ticket offers a student discount
    public SAdvanceTicket(int num, int days){
        super(num,days);
    }//passes the values to calculate the price
    public double getPrice(){//gets the price depending on the amount of days
        if(Days>=10){
            this.Price = 15.00;
        }else if(Days<10){
            this.Price = 20.00;
        }
        return this.Price;
    }
    public String toString(){
        return super.toString()+"(ID Required)" + "\n";//prints out the ticket values
    }
}


