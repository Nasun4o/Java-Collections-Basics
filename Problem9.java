import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by PC-PC on 3/29/2016.
 */
public class Problem9 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        TreeMap<String, Integer> dictionary = new TreeMap<>();
        String[] text = Arrays.asList(console.nextLine()
                .toLowerCase()
                .split("\\W"))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);

        int maxCount = 0;
        for (int i = 0; i < text.length; i++) {

            if (!dictionary.containsKey(text[i])){
                int wordCount = 0;
                for (int j = i; j <text.length ; j++) {
                    if (text[i].equals(text[j])){
                        wordCount++;
                    }
                }

                if (wordCount > maxCount){
                    maxCount = wordCount;
                }
                dictionary.put(text[i], wordCount);
            }
        }

        for (String word : dictionary.keySet()){
            if (dictionary.get(word) == maxCount){
                System.out.printf("%s - > %d times\n", word, dictionary.get(word));
            }
        }
    }
}
