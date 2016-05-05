import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by PC-PC on 3/29/2016.
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] cards = Arrays.asList(console.nextLine()
                .split(" "))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        int numberOfCards = cards.length;

        LinkedHashMap<String, Integer> hand = new LinkedHashMap<>();
        for (String c : cards){
            String faces = c.substring(0, c.length() - 1);

            if (hand.containsKey(faces)){
                hand.put(faces, hand.get(faces) +1);
            }else{
                hand.put(faces, 1);
            }
        }

        for (String face : hand.keySet()){
            double precents = (hand.get(face) * 100.0) / numberOfCards;
            System.out.printf("%s ->  %.2f%%\n", face, precents);
        }
    }
}
