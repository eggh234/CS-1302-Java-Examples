//Name: Yen-Ju Huang
//PIN:002-54-5487
//Due date: Fri July 23
//Lab 13
import java.util.*;
 class Lab14 {
    public static void main(String[] args) {
        ArrayList<Character> Name1 = new ArrayList<Character>();//creates the arraylist
        Name1.add('b');//adds the name bob once
        Name1.add('o');
        Name1.add('b');
        RedundantCharacterMatch(Name1);
        ArrayList<Character> Name2 = new ArrayList<Character>();//declares array one
        Name2.add('b');
        Name2.add('o');
        Name2.add('b');//adds the name bob twice
        Name2.add('b');
        Name2.add('o');
        Name2.add('b');
        RedundantCharacterMatch(Name2);
    }
    public static void RedundantCharacterMatch(ArrayList<Character> name) {
        Map<Character, String> map = new HashMap<>();//creates a hashmap
        for(int i = 0; i<name.size();i++){//gets the arraylist name
            if (!map.containsKey(name.get(i))){//checks the current character for the key
                map.put(name.get(i), Integer.toString(i));//if no key then add it
            } else {
                String str = map.get(name.get(i));
                str = str + ", " + i;
                map.replace(name.get(i), str);//if there is a key then update the index
            }
        }
        for(Character x : map.keySet())
            System.out.println(x +": " +map.get(x));//prints the output
    }
}

