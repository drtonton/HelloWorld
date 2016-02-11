import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by noellemachin on 2/11/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Edward", "Albert", "Beth"};
        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();  //HASHMAP WITH ARRAY LIST NESTED INSIDE

        //create empty array list
        for (String name : names) {      // read this as "for each name in names:"
            char firstLetter = name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<String>());
        }

        //add names
        for (String name : names) {
            char firstLetter = name.charAt(0);
            nameMap.get(firstLetter).add(name);

        }
        System.out.println(nameMap);
    }
}
