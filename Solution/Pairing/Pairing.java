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
        List<List<String>> pairs = new ArrayList<>();
        for (int i = 0; i < women.size(); i++) {
            List<String> pair = new ArrayList<>();
            pair.add(women.get(i));
            pair.add(men.get(i));
            pairs.add(pair);
        }

        return pairs;
    }
}
