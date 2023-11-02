package ReturnEvenNumbers;

import java.util.ArrayList;
import java.util.List;

import static ReturnEvenNumbers.ReturnEvenNumbers.noOdds;

public class main {

    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(6);
        numbers1.add(7);
        numbers1.add(8);

        List<Integer> result1 = noOdds(numbers1);
        //System.out.println(result1);  // Output: [2, 4, 6, 8]
        for (int number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.print("\nResult (Even numbers): ");
        for (int even : result1) {
            System.out.print(even + " ");
        }
        System.out.println();
        System.out.println();

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(43);
        numbers2.add(65);
        numbers2.add(23);
        numbers2.add(89);
        numbers2.add(53);
        numbers2.add(9);
        numbers2.add(6);

        List<Integer> result2 = noOdds(numbers2);
        //System.out.println(result2);  // Output: [6]
        for (int number : numbers2) {
            System.out.print(number + " ");
        }
        System.out.print("\nResult (Even numbers): ");
        for (int even : result2) {
            System.out.print(even + " ");
        }
        System.out.println();
        System.out.println();

        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(718);
        numbers3.add(991);
        numbers3.add(449);
        numbers3.add(644);
        numbers3.add(380);
        numbers3.add(440);

        List<Integer> result3 = noOdds(numbers3);
        //System.out.println(result3);  // Output: [718, 644, 380, 440]
        for (int number : numbers3) {
            System.out.print(number + " ");
        }
        System.out.print("\nResult (Even numbers): ");
        for (int even : result3) {
            System.out.print(even + " ");
        }
        System.out.println();
    }
}
