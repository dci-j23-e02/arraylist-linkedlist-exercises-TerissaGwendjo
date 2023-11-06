package Pairing;

import java.util.ArrayList;
import java.util.List;
public class Pairing {

    //Method zipIt.It takes two parameters: women and men, both of type List<String>
    public static List<List<String>> zipIt(List<String> women, List<String> men) {
        // Check if the sizes of the two ArrayLists are different
        if (women.size() != men.size()) {
            return null;  // Return null if the sizes are different
        }

        // List<List<String>> is a data type in Java that represents a list of lists of strings,a list that contains other lists.
        List<List<String>> pairs = new ArrayList<>(); // new arrayList called pairs is created. This list is intended
        // to store pairs of elements, and each pair is represented as a list of strings (List<String>).
        for (int i = 0; i < women.size(); i++) {
            List<String> pair = new ArrayList<>();
            //Within the loop, a new ArrayList called pair is created. This pair list is meant to hold a single pair
            // of elements, where the first element is a woman's name and the second element is a man's name.
            pair.add(women.get(i));
            // the woman's name at position i in the women list is retrieved using women.get(i), and it is added to
            // the pair list using the add method.
            pair.add(men.get(i));
            pairs.add(pair);
        }

        return pairs;
        //after loop has been processed, the method returns the pairs list, which contains all the pairs of women and
        // men in the order they were found in the input lists.
    }
}
