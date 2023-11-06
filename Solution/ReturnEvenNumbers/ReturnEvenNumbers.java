package ReturnEvenNumbers;

import java.util.ArrayList;
import java.util.List;

public class ReturnEvenNumbers {

    // This line defines a static method called noOdds that takes one parameter: numbers, which is of type List<Integer>
    public static List<Integer> noOdds(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            // A for-each loop is used to iterate through each element in the numbers list. The loop assigns each element to
            // the variable number one by one, allowing you to examine each element in the list.
            if (number % 2 == 0) {
                evenNumbers.add(number);
                // If the current number is even, it is added to the evenNumbers list using the add method of the ArrayList.
                // This step accumulates the even numbers as the loop goes through the list.
            }
        }
        return evenNumbers;
        // After the loop has finished iterating through the numbers list, the method returns the evenNumbers list.
        // This evenNumbers list contains all the even numbers from the original numbers list, and they are stored in
        // the same order in which they were found.
    }
}

   // In summary, the noOdds method takes a list of integers, iterates through it, and filters out the even numbers,
// which are then stored in a new list (evenNumbers). This new list is returned as the result of the method, containing
// the even numbers in the same order they appeared in the original list.

