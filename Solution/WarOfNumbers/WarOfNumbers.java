package WarOfNumbers;

import java.util.LinkedList;

public class WarOfNumbers {

    public static int warOfNumbers(LinkedList<Integer> numbers) {
        //  initialize two variables, sumEven and sumOdd, to keep track of the sums of even and odd numbers, respectively.
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            // a "for-each" loop that iterates through each element of the numbers list. It assigns each
            // element to the variable number one by one, allowing you to process each number in the list.
            if (number % 2 == 0) {
                sumEven += number; // Add to the even sum
                // If the current number is even (i.e., the if condition is true), it adds that number to the sumEven
                // variable. sumEven is a running total that accumulates the sum of all even numbers in the list.
            } else {
                sumOdd += number;  // Add to the odd sum
            }
        }

        return Math.abs(sumEven - sumOdd); // Return the absolute difference, hence "Math.abs"
        // Taking the absolute value ensures that the result is always positive, as the problem statement asked for
        // the difference between the sums of even and odd numbers, without regard to which one is larger.
    }
}

