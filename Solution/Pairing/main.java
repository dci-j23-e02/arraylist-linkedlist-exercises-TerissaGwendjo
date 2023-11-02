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

        List<List<String>> result1 = Pairing.zipIt(women1, men1);
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