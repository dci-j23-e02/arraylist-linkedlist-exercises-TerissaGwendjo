package Pairing;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<String> women1 = new ArrayList<>();
        women1.add("Terissa");
        women1.add("Carolyn");
        women1.add("Yvette");

        List<String> men1 = new ArrayList<>();
        men1.add("Derick");
        men1.add("Rolf");
        men1.add("Guymellen");

        List<List<String>> result1 = Pairing.zipIt(women1, men1); // a new variable result1 declared
        System.out.println(result1);  // Output: [["Terissa", "Derick"], ["Carolyn", "Rolf"], ["Yvette", "Guymellen"]]

        List<String> women2 = new ArrayList<>();
        women2.add("Blanche");
        women2.add("Magdalene");

        List<String> men2 = new ArrayList<>();
        men2.add("Armand");
        men2.add("Helmut");

        List<List<String>> result2 = Pairing.zipIt(women2, men2);
        System.out.println(result2);  // Output: [["Elise", "John"], ["Mary", "Rick"]]

        List<String> women3 = new ArrayList<>();
        women3.add("Ana");
        women3.add("Amy");
        women3.add("Lisa");

        List<String> men3 = new ArrayList<>();
        men3.add("Bob");
        men3.add("Josh");

        List<List<String>> result3 = Pairing.zipIt(women3, men3);
        System.out.println(result3);  // Output: null

        List<String> women4 = new ArrayList<>();
        women4.add("Ana");
        women4.add("Amy");
        women4.add("Lisa");

        List<String> men4 = new ArrayList<>();
        men4.add("Bob");
        men4.add("Josh");
        men4.add("Tim");

        List<List<String>> result4 = Pairing.zipIt(women4, men4);
        System.out.println(result4);  // Output: [["Ana", "Bob"], ["Amy", "Josh"], ["Lisa", "Tim"]]
    }
}

//NOTES:
//List<List<String>> result1: This part of the line declares a new variable named result1.
// It's of type List<List<String>>, which means it's a list of lists of strings. This variable will store the result
// of the zipIt method, which will be a list of pairs (each pair containing two strings).
//Pairing.zipIt(women1, men1): This part of the line calls the zipIt method from the Pairing class with women1 and
// men1 as its arguments.
//Pairing is the class that contains the zipIt method. To call a method from another class, you specify the class
// name followed by a dot and then the method name.
//zipIt is the method being called, and it expects two arguments, which are women1 and men1. These arguments are being
//passed to the method to perform the pairing of women and men.
//So, the result of the zipIt method is assigned to the result1 variable. The result1 variable will now contain a list
//of pairs created by the zipIt method based on the women1 and men1 lists.