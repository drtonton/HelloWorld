import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by noellemachin on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<String> names = new ArrayList<>();
        // read names into arraylist, ex: "Martha Jenkins"
//        String searchTerm = "ali";
        //new Arraylist called "results", which returnes a case-insensitive search result matching searchTerm
//        File f = new File("people.csv");
//        Scanner scanner = new Scanner(f);
//        scanner.nextLine();
//        while (scanner.hasNext()) {
//            String next = scanner.nextLine();
//            String [] columns = next.split(",");
//            String person = columns[1] + " " + columns[2];
//              names.add(person);
        Scanner scanner = new Scanner(new File("people.csv"));
        scanner.nextLine();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }

        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList<>();
        for (String name : names) {
            if(name.toLowerCase().contains(searchTerm)) {
                results.add(name);
            }
        }
        System.out.println(results);

        results = names.stream()
                .filter((name)-> {
                    return name.toLowerCase().contains(searchTerm);
                    })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(results);
    }
}
