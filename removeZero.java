//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Wed July 14
//Homework 7
import java.util.*;
class NewArrayList{
    public static void main(String []args) {//the main class
        int a;
        System.out.println("Enter the element");//asks for the element
        Scanner sc = new Scanner(System.in);//the new scanner
        ArrayList <Integer>arr=new ArrayList<Integer>();
        for(int i = 0; i < 7; i++) {//the array adds the 7 elements
            a = sc.nextInt();
            arr.add(a);//adds it to the array
        }
        System.out.println("before removing element is:");
        System.out.println(arr);
        System.out.println("\nafter removing element is\n");
        removeZero(arr);
    }
    static void removeZero(ArrayList<Integer> array) {//removes the 0
        array.removeAll(Arrays.asList(0));//used for removing the 0 from the arraylist
        System.out.println(array);
    }
}

