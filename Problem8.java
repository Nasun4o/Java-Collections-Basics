import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by PC-PC on 3/27/2016.
 */
public class Problem8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] text = Arrays.asList(console.nextLine().
                toLowerCase().
                split("\\W")).
                stream().
                filter(str -> !str.isEmpty()).
                collect(Collectors.toList()).
                toArray(new String[0]);
        HashSet<String> words = new HashSet<>();

        for (String word : text){
            words.add(word);
        }

        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords);
        System.out.println(sortedWords);
    }
}
