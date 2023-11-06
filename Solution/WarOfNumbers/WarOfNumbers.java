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

//NOTES:
//List Interface:
//
//List is an interface in Java, which is a part of the Java Collections Framework. It defines a collection of elements
//ordered in a specific sequence. It allows duplicate elements and provides various methods for working with lists,
//such as adding, removing, and accessing elements.
//LinkedList Implementation:
//LinkedList is a concrete class in Java that implements the List interface. It is one of the implementations of lists.
// A LinkedList is a data structure where elements are stored in nodes, and each node points to the next and previous
// nodes, creating a linked list. This data structure provides efficient insertion and deletion operations, especially
// for adding or removing elements from the middle of the list.


