
/*  Create ArrayList of integer, add 5 integers to the array 
and write en method to return the minimum element of that array
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class week10b {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(23);
        numbers.add(10);
        numbers.add(6);
        int minNum = Collections.min(numbers);
        System.out.println("The minimum number in the ArrayList is " + minNum);

        // Use of LinkedList to remove double entry and print it out
        LinkedList<String> doubleWord = new LinkedList<String>();
        doubleWord.add("Ali");
        doubleWord.add("Sam");
        doubleWord.add("Ali");
        doubleWord.remove("Ali");
        Iterator<String> iterator = doubleWord.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
