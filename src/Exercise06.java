import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by noellemachin on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};
        // reverse the list
        // turn into a hashmap
        // {"Smith":"Alice", "Hope":"Bob", "Brown":"Charlie"}

//        ArrayList<String> reversedNames = new ArrayList<>();
//        for (int i = names.length-1; i >= 0; i--) {
//            reversedNames.add(names[i]);
//        }
//        System.out.println(reversedNames);
// 8239571927509823 THIS IS THE OPTIMAL METHOD, HERE IS ANOTHER 04084104

        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);


        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i += 2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }
    }
}
