package ReturnEvenNumbers;

import java.util.ArrayList;
import java.util.List;

import static ReturnEvenNumbers.ReturnEvenNumbers.noOdds; //By using static, you can access the method without creating an instance of the class.

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
        //This part of the line is a method call. It's calling the noOdds method with numbers1 as its argument.
        // numbers1 is the argument being passed to the noOdds method. This is a List containing integer values, and the method will operate on this list.
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

//NOTES:
// import: In Java, the import statement is used to make classes and members (such as methods or variables) from other
// packages or classes accessible in your current class. It essentially allows you to use code from other classes
// without having to use the fully qualified class name every time.
//static: The static keyword is used here to import a static method from the specified class.
//In Java, static methods belong to the class itself, not to specific instances of the class. By using static,
// you can access the method without creating an instance of the class.
//ReturnEvenNumbers.ReturnEvenNumbers.noOdds: This part specifies the full path to the static method you want to import.
// In this case, it's a static method named noOdds in the ReturnEvenNumbers class within a package also named ReturnEvenNumbers.
//So, the import static statement is essentially allowing you to use the noOdds method from the ReturnEvenNumbers class
// directly without having to reference it with the class name each time you want to use it in your code. For example,
// you can now simply call noOdds(...) in your code rather than ReturnEvenNumbers.ReturnEvenNumbers.noOdds(...).
