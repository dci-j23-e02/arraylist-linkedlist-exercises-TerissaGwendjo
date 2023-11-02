package WarOfNumbers;

import java.util.LinkedList;

import static WarOfNumbers.WarOfNumbers.warOfNumbers;

public class main {

    public static void main(String[] args) {
        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(2);
        numbers1.add(8);
        numbers1.add(7);
        numbers1.add(5);

        int result1 = warOfNumbers(numbers1);
        System.out.println(numbers1);
        System.out.println(result1);  // Output: 2
        System.out.println();

        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(12);
        numbers2.add(90);
        numbers2.add(75);

        int result2 = warOfNumbers(numbers2);
        System.out.println(numbers2);
        System.out.println(result2);  // Output: 27
        System.out.println();

        LinkedList<Integer> numbers3 = new LinkedList<>();
        numbers3.add(5);
        numbers3.add(9);
        numbers3.add(45);
        numbers3.add(6);
        numbers3.add(2);
        numbers3.add(7);
        numbers3.add(34);
        numbers3.add(8);
        numbers3.add(6);
        numbers3.add(90);
        numbers3.add(5);
        numbers3.add(243);

        int result3 = warOfNumbers(numbers3);
        System.out.println(numbers3);
        System.out.println(result3);  // Output: 168
    }
}
