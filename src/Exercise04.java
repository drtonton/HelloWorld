import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.util.*;

/**
 * Created by noellemachin on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        List<String> wordList = Arrays.asList(words);
        LinkedHashSet<String> wordSet = new LinkedHashSet<String>(wordList);
        System.out.println(String.join(" ", wordSet));
        // to be or not that is the question
    }
}